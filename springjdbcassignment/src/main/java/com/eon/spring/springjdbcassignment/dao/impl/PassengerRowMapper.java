package com.eon.spring.springjdbcassignment.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.eon.spring.springjdbcassignment.dto.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {


	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger p=new Passenger();
		p.setId(rs.getInt(1));
		p.setFirstName(rs.getString(1));
		p.setLastName(rs.getString(3));
		return p;
	}

}
