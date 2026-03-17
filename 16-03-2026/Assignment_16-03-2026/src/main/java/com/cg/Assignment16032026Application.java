package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:data.properties")
@ComponentScan
public class Assignment16032026Application {
    @Bean
    public Employee getEmployee(){
        return new Employee(103,"Samar",2500,25);
    }@Bean
    public Employee getEmployee1(){
        return new Employee(103,"Samar",2500,25);
    }@Bean
    public Employee getEmployee2(){
        return new Employee(103,"Samar",2500,25);
    }

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(Assignment16032026Application.class, args);
//       Employee emp = ctx.getBean(Employee.class);
//        emp.PrintDetails();

        SBU s=ctx.getBean(SBU.class);
        s.getSbu();
    }

}
