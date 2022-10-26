package com.eon.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.eon.spring.springjdbc.employee.dao.EmployeeDao;
import com.eon.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.eon.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public int create(Employee emp) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbctemplate.update(sql, emp.getId(), emp.getFirstName(), emp.getLastName());
		return result;
	}
	
	@Override
	public int update(Employee emp) {
		String sql = "update employee set id=?, lastname=? where firstname=?";
		int result = jdbctemplate.update(sql, emp.getId(), emp.getLastName(), emp.getFirstName());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbctemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
			String sql="select * from employee where id=?";
			EmployeeRowMapper rowMapper=new EmployeeRowMapper();
			Employee emp = this.jdbctemplate.queryForObject(sql, rowMapper,id);
			return emp;
	}

	@Override
	public List<Employee> read() {
		String sql="select * from employee";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		List<Employee> emp = this.jdbctemplate.query(sql, rowMapper);
		return emp;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


// ALT + arrow buttom to move seleted code
