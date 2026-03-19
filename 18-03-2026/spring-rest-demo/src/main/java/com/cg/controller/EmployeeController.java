package com.cg.controller;

import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService service;

    @GetMapping("employees")
    public List<Employee> getXyz(){
//        return new Employee(1001, "Saurabh", LocalDate.of(1984,2,1),5000);
        return service.getAllEmployee();
    }
    @GetMapping("emp/{name}")
    public List<Employee> getabc(@PathVariable String name){
        return service.getEmployeeByName(name);
    }

    @GetMapping("/{eid}")
    public Employee getEmployee(@PathVariable int eid){
        return service.getEmployee(eid);
    }

    @PostMapping
    public Employee createNewEmployee(@RequestBody Employee emp){
        return service.createEmployee(emp);
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable int id){
        return service.removeEmployee(id);
    }
}
