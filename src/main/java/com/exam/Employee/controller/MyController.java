package com.exam.Employee.controller;


import com.exam.Employee.entity.Employee;
import com.exam.Employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@CrossOrigin("*")
public class MyController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employee")
    public Collection<Employee> getAll(){

        return  this.employeeService.getAll() ;

    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {

        return this.employeeService.findById(id);
    }


    @PostMapping(path="/employee",consumes="application/JSON")
    public Employee addEmployee(@RequestBody Employee employee) {

        return this.employeeService.addEmployee(employee);
    }

}

