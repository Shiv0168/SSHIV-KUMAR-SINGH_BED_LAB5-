package com.gl.ems.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.ems.entity.Employee;
import com.gl.ems.repository.EmployeeRepository;
import com.gl.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> listEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		
		return employeeRepository.findById(id).get();		
	}

	@Override
	public void deleteById(Long id) {
		
		employeeRepository.deleteById(id);
	}


}
