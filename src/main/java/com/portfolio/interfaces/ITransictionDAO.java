package com.portfolio.interfaces;

import com.portfolio.entity.Transiction;

public interface ITransictionDAO {
	public boolean addTransiction (Transiction transiction);
	public Transiction getAllTransiction (String email);
	public boolean deleteTransiction(int tId);
}
