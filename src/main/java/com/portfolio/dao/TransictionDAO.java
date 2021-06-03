package com.portfolio.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.portfolio.entity.Transiction;
import com.portfolio.interfaces.ITransictionDAO;
import com.portfolio.utils.GetConnection;

public class TransictionDAO implements ITransictionDAO {

	public boolean addTransiction(Transiction transiction) {

		String sql = "insert into transictions "
				+ "(email, date_time, received_qty, received_currency, send_qty, send_currency, fee_amount, fee_currency, remarks) "
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql)) {
			Timestamp timestamp = Timestamp.valueOf(transiction.getDateTime());
			ps.setString(1, transiction.getEmail());
			ps.setTimestamp(2, timestamp);
			ps.setDouble(3, transiction.getReceivedQty());
			ps.setString(4, transiction.getReceivedCurrency());
			ps.setDouble(5, transiction.getSendQty());
			ps.setString(6, transiction.getSendCurrency());
			ps.setDouble(7, transiction.getFeeAmount());
			ps.setString(8, transiction.getFeeCurrency());
			ps.setString(9, transiction.getRemarks());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public List<Transiction> getAllTransiction(String email) {

		String sql = "select "
				+ "t_id, email, date_time, received_qty, received_currency, send_qty, send_currency, fee_amount, fee_currency, remarks "
				+ "from transictions where email = ?";

		List<Transiction> list = null;

		try (PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql)) {

			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			list = new ArrayList<Transiction>();

			while (rs.next()) {
				Transiction transiction = new Transiction();

				LocalDateTime ldt = rs.getTimestamp(3).toLocalDateTime();

				transiction.settId(rs.getInt(1));
				transiction.setEmail(rs.getString(2));
				transiction.setDateTime(ldt);
				transiction.setReceivedQty(rs.getDouble(4));
				transiction.setReceivedCurrency(rs.getString(5));
				transiction.setSendQty(rs.getDouble(6));
				transiction.setSendCurrency(rs.getString(7));
				transiction.setFeeAmount(rs.getDouble(8));
				transiction.setFeeCurrency(rs.getString(9));
				transiction.setRemarks(rs.getString(10));

				list.add(transiction);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public boolean deleteTransiction(int tId) {

		String sql = "delete from transictions where t_id = ?";

		try (PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql)) {

			ps.setInt(1, tId);

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
