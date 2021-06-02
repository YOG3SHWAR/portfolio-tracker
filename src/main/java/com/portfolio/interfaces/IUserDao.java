package com.portfolio.interfaces;

import com.portfolio.entity.User;

public interface IUserDao {
	public boolean addUser(User user);
	public User getUser(String eamil);
}
