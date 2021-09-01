package com.exam.Employee.services;

import com.exam.Employee.entity.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneServiceImpl implements  PhoneService{

    List<Phone> phone;

    public PhoneServiceImpl(){

        phone = new ArrayList<>();

        phone.add(new Phone("214-875-9987", "mobile"));


    }


}
