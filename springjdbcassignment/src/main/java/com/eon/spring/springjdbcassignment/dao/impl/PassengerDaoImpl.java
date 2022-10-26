package com.eon.spring.springjdbcassignment.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.eon.spring.springjdbcassignment.dao.PassengerDao;
import com.eon.spring.springjdbcassignment.dto.Passenger;

@Component("passdaoimpl")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	private RowMapper rowMapper= new PassengerRowMapper();

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public Passenger read(int id) {
		String sql="select * from passenger where id=?";
		Passenger Passenger = (com.eon.spring.springjdbcassignment.dto.Passenger) this.jdbctemplate.queryForObject(sql, rowMapper, id);
		return Passenger;
	}

	@Override
	public int create(Passenger p) {
		String sql = "insert into passenger values(?,?,?)";
		int result = this.jdbctemplate.update(sql,p.getId(), p.getFirstName(), p.getLastName());
		return result;
	}

	public RowMapper getRowMapper() {
		return rowMapper;
	}

	public void setRowMapper(RowMapper rowMapper) {
		this.rowMapper = rowMapper;
	}

	@Override
	public int update(Passenger p) {
		String sql= "UPDATE passenger SET firstname =? WHERE ID =?";
		int result=this.jdbctemplate.update(sql, p.getFirstName(),p.getId());
		//int result=this.jdbctemplate.update(sql, p.getFirstName(),10); - both are write
		return result;
	}

	@Override
	public int delete(int id) {
		String sql="delete from passenger where id=?";
		int result=this.jdbctemplate.update(sql, id);
		return result;
	}

	@Override
	public List<Passenger> read() {
		String sql="select * from passenger";
		List<Passenger> p = this.jdbctemplate.query(sql, rowMapper);
		return p;
	}

	@Override
	public String toString() {
		return "PassengerDaoImpl [jdbctemplate=" + jdbctemplate + "]";
	}

}
