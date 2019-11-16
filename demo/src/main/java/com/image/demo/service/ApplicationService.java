package com.image.demo.service;

import java.util.List;

import com.image.demo.model.Employee;

public interface ApplicationService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();
}
