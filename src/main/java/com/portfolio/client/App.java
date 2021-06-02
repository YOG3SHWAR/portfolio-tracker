package com.portfolio.client;

import java.time.LocalDateTime;

import com.portfolio.dao.TransictionDAO;
import com.portfolio.dao.UserDAO;
import com.portfolio.entity.Transiction;
import com.portfolio.entity.User;
import com.portfolio.interfaces.ITransictionDAO;
import com.portfolio.interfaces.IUserDao;

public class App {
	public static void main(String[] args) {
		User user = new User();
		user.setuId(1);
		user.setName("Yogeshwar Chaturvedi");
		user.setEmail("kanhay8@gmail.com");

		IUserDao userDAO = new UserDAO();
		ITransictionDAO dao = new TransictionDAO();
		
		LocalDateTime ldt = LocalDateTime.now();
		
		Transiction transiction = new Transiction();
		transiction.setEmail("kanhay8@gmail.com");
		transiction.setDateTime(ldt);
		transiction.setReceivedQty(1.00005);
		transiction.setReceivedCurrency("ETH");
		transiction.setSendQty(300);
		transiction.setSendCurrency("INR");
		transiction.setFeeAmount(200000.543);
		transiction.setFeeCurrency("INR");
		transiction.setRemarks("Testing");

		System.out.println(userDAO.addUser(user));
		System.out.println(userDAO.getUser("kanhay8@gmail.com"));		
		System.out.println(dao.addTransiction(transiction));
	}
}
