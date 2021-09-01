package com.exam.Employee.services;

import com.exam.Employee.entity.Employee;
import com.exam.Employee.entity.Phone;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> list = new ArrayList<>();

    Phone p =new Phone("214.875,9987","9987");



    EmployeeServiceImpl() {

        list.add( new Employee(1,"jack","Ryan", p,"tennis,cricket,baseball","male","phone,mail"));




    }


    @Override
    public List<Employee> getAll() {

        return  list;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        list.add(employee);


        return employee;
    }


    @Override
    public Employee findById(int id) {
        Employee u =null;
        for(Employee employee:list) {

            if(employee.getId() == id)
            {
                u=employee;
                break;
            }
        }
        return u;
    }
}




