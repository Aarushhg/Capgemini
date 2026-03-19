package com.cg.service;

import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepo repo;

    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    @Override
    public Employee createEmployee(Employee emp) {

        return repo.saveAndFlush(emp);
    }

    @Override
    public Employee getEmployee(int empid ) {
        Optional<Employee> employee = repo.findById(empid);
        if(employee.isPresent()){
            return employee.get();
        }else{
            return null;
        }
    }

    @Override
    public String removeEmployee(int empid) {
        Employee employee=getEmployee(empid);
        if(employee!=null){
            repo.deleteById(employee.getEmpid());
            return "Employee deleted!!!!!!!!!!!!";
        }else{
            return "Employee not found!!!!!!!!!!!!";
        }
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        if(getEmployee(emp.getEmpid())!=null){
            return repo.saveAndFlush(emp);
        } else return null;
    }
    public List<Employee> getEmployeeByName(String name){

        return repo.findByName(name);
    }
}
