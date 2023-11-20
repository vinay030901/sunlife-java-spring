package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDAO {

	@Autowired
	DataSource dataSource; // this will load the application.properties file

	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}

	@Override
	public void addEmployee(Employee emp) {
		System.out.println("these changes are in the feature1");
		String sql = "insert into employee(empId,empName,empCity) values(?,?,?)";
		getJdbcTemplate().update(sql, new Object[] { emp.getEmpId(), emp.getEmpName(), emp.getEmpCity() });

	}
	public void feature2(){
		System.out.println("this is feature 2");
	}

}
