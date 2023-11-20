package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDAO;
import com.dao.InsuranceDAO;
import com.dao.ProjectDAO;
import com.model.Employee;
import com.model.Insurance;
import com.model.Project;

@Service("esi")
public class InsuranceServiceImpl implements InsuranceService {

	// autowired will connect dao to EmployeeDAOImpl
	@Autowired
	private EmployeeDAO empDao;

	@Autowired
	private InsuranceDAO insDao;
	
	@Autowired
	private ProjectDAO proDao;

	@Override
	public void addInsToEmp(Employee emp, Insurance ins) {
		empDao.addEmployee(emp);
		if (emp.getEmpId() == 103) {
			throw new RuntimeException("Something went wrong..");
		}
		insDao.addInsurance(ins);
	}

	@Override
	public void addProToEmp(Employee emp, Project pro) {
		empDao.addEmployee(emp);
		proDao.addProject(pro);
		
	}

}
