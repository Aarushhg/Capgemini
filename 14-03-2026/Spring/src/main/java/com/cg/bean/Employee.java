package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
public class Employee {
    @Value("${empId}")
    private int empid;
    @Value("${empName}")
    private String name;
//    private Address address=new Address();
    @Autowired
    @Qualifier("address")
    private Address address;
    public Employee() {}
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void printEmployeeDetails() {
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Name: "+name);
        System.out.println("----Address----");
        System.out.println("City: "+address.getCity());
        System.out.println("Country: "+address.getCountry());
        System.out.println("Zip: "+address.getZip());
    }
}
