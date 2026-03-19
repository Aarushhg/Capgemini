package com.cg;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDataAppApplication.class, args);
        EmployeeService es=ctx.getBean(EmployeeService.class);
//        System.out.println(es.createEmployee(new Employee("Aarush", LocalDate.of(2004,9,24),87000)));
//        es.getAllEmployee().forEach(e-> System.out.println(e));
//        System.out.println(es.removeEmployee(2));
//        Employee e=es.getEmployee(1);
//        if(e!=null){
//            e.setDob(LocalDate.of(2002,6,25));
//            System.out.println(es.updateEmployee(e));
//        } else {
//            System.out.println("Employee Not Found");
//        }
//        es.getEmployeeByName("Aarush").forEach(e->System.out.println(e));
        es.getEmployeeByDob(9).forEach(e->System.out.println(e.getName()));
    }

}
