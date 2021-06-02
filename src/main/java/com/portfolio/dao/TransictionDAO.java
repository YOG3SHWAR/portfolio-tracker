package com.portfolio.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

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

	public Transiction getAllTransiction(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteTransiction(int tId) {
		// TODO Auto-generated method stub
		return false;
	}

}
