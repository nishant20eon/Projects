package com.eon.spring.springjdbcassignment.dao;

import java.util.List;

import com.eon.spring.springjdbcassignment.dto.Passenger;

public interface PassengerDao {
	
	// Curd Operation
	
	public int create(Passenger p);
	public int update(Passenger p);
	public int delete(int id);
	public Passenger read(int id);
	List<Passenger> read();

}
