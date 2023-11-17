package com.dl.dao;

import com.dl.model.Honda;

public interface HondaDao {

	public int create(Honda honda);
	public void update(Honda honda);
	public void delete(Honda honda);
	
}