package com.dl.dao;

import java.util.List;

import com.dl.model.Honda;

public interface HondaDao {

	public int insertRecord(Honda honda);
	
	public int updateRecord(Honda honda);
	
	public List<Honda> listVechiles();
	
	
}
