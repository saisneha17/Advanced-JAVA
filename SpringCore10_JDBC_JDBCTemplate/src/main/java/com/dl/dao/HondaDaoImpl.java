package com.dl.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dl.model.Honda;

@Component("hondaDao")
public class HondaDaoImpl implements HondaDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertRecord(Honda honda) {
		
		String sql = "insert into Honda values(?, ?, ?, ?)";
		int insert = jdbcTemplate.update(sql, honda.getId(), honda.getBikeColor(), honda.getBikeName(), honda.getCc());
		
		return insert;
	}

	public int updateRecord(Honda honda) {
		
		String sql = "update honda set bikeName=?, bikeColor=?, cc=? where id=?";
		int update = jdbcTemplate.update(sql, honda.getBikeName(), honda.getBikeColor(), honda.getCc(), honda.getId());
		return update;
	}

	public List<Honda> listVechiles() {
		
		String sql = "select * from Honda";
		List<Honda> honda = jdbcTemplate.query(sql, new HondaRowMapper());
		return honda;
	}

}
