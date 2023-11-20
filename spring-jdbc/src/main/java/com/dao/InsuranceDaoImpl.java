package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.model.Insurance;

@Repository
public class InsuranceDaoImpl extends JdbcDaoSupport implements InsuranceDAO {

	@Autowired
	DataSource dataSource; // this will load the application.properties file

	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}



	@Override
	public void addInsurance(Insurance ins) {
		String sql = "insert into insurance(empId,insurance_type,coverage) values(?,?,?)";
		getJdbcTemplate().update(sql, new Object[] { ins.getEmpId(), ins.getIns().toString(), ins.getCoverageAmount() });

	}

}
