package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Car c = (Car) ctx.getBean("car");
//        c.setName("I20");
//        c.setEngine((CNGEngine)ctx.getBean("cng"));
//        c.setTyre((JKTyre)ctx.getBean("jk"));
//        c.printCar();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Engine Type (Petrol or CNG)");
//        String etype = sc.next();
//        System.out.println("Enter Tyre Choice (MRF or JK)");
//        String tyre = sc.next();
//
//        IEngine e = (IEngine) ctx.getBean(etype.toUpperCase());
//        ITyre t=(ITyre) ctx.getBean(tyre.toUpperCase());
//        c.setEngine(e);
//        c.setTyre(t);
        c.printCar();

    }
}
