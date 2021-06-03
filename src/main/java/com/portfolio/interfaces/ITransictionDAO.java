package com.portfolio.interfaces;

import java.util.List;

import com.portfolio.entity.Transiction;

public interface ITransictionDAO {

	public boolean addTransiction(Transiction transiction);

	public List<Transiction> getAllTransiction(String email);

	public boolean deleteTransiction(int tId);

}
