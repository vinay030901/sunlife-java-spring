package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.model.Insurance;
import com.model.Project;

@Repository
public class ProjectDaoImpl extends JdbcDaoSupport implements ProjectDAO {

	@Autowired
	DataSource dataSource; // this will load the application.properties file

	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}
	
	@Override
	public void addProject(Project pro) {
		String sql = "insert into project(empId,project_id,project_name,location) values(?,?,?,?)";
		getJdbcTemplate().update(sql, new Object[] { pro.getEmpId(), pro.getProjectId(), pro.getProjectName(),pro.getLocation() });

	}

}
