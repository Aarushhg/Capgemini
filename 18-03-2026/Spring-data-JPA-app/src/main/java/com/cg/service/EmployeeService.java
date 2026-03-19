package com.cg.service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo erepo;
    public String createEmployee(Employee emp){
        Employee e = erepo.saveAndFlush(emp);
        return "Employee Created! Your EmpId is:" +e.getEmpid();

    }

    public List<Employee> getAllEmployee(){
        return erepo.findAll();
    }

    public Employee getEmployee(int id){
        Optional<Employee> op = erepo.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        else {
            return null;
        }
    }

    public String removeEmployee(int empid){
        if(getEmployee(empid)!=null) {
            erepo.deleteById(empid);
            return "Employee Removed";
        } else {
            return "Employee Not Found";
        }
    }

    public String updateEmployee(Employee e){
        erepo.saveAndFlush(e);
        return "Employee Updated";
    }

    public List<Employee> getEmployeeByName(String name){
//        return erepo.findByName(name);
          return erepo.findByNa(name);
    }

    public List<Employee> getEmployeeByDob(int month){
        return erepo.findByDobBetween(LocalDate.of(2004,month,1), LocalDate.of(2004,month,30));
    }
}
