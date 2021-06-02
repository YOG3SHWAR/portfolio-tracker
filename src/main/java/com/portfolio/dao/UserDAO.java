package com.portfolio.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.portfolio.entity.User;
import com.portfolio.interfaces.IUserDao;
import com.portfolio.utils.GetConnection;

public class UserDAO implements IUserDao {

	public boolean addUser(User user) {
		String sql = "insert into users (name, email) values(?, ?)";
		try (PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql)) {
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			return ps.executeUpdate() >0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public User getUser(String email) {
		String sql = "select u_id, name, email from users where email = ?";
		try (PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql)) {
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				User user = new User();
				user.setuId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				return user;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
