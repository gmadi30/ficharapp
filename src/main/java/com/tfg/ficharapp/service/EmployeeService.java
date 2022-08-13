package com.tfg.ficharapp.service;

import com.tfg.ficharapp.model.Employee;

import java.util.List;


public interface EmployeeService {

     Employee saveEmployee(Employee employee);

     List<Employee> getAllEmployees();
}
