package com.example.springexam.service;

import com.example.springexam.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Object createEmployee(Employee employee);
    public List<Employee> findAllEmployees();
}
