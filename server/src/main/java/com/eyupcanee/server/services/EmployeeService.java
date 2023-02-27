package com.eyupcanee.server.services;

import com.eyupcanee.server.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getEmployees();
}
