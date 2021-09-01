package com.exam.Employee.services;

import com.exam.Employee.entity.Employee;

import java.util.List;

public interface EmployeeService {


    public List<Employee> getAll();

    public Employee addEmployee(Employee employee);

    public Employee findById(int id);

}
