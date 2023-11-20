package com.service;

import com.model.Employee;
import com.model.Insurance;
import com.model.Project;

public interface InsuranceService {

	public void addInsToEmp(Employee emp,Insurance ins);
	public void addProToEmp(Employee emp,Project pro);

}
