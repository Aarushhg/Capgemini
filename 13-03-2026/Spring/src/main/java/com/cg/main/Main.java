package com.cg.main;

import com.cg.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
//        HelloWorld h = (HelloWorld) ctx.getBean("hello");
//        System.out.println(h.sayHello("Aarush"));
        HelloWorld h1 = (HelloWorld) ctx.getBean("hello");
//        HelloWorld h2 = (HelloWorld) ctx.getBean("hello");
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h1==h2);
//        h1.setName("Aarush");
//        h2.setName("Vinay");
        System.out.println(h1.SayHello());
//        System.out.println(h2.SayHello());
        System.out.println("----Language----");
        System.out.println(h1.getLanguage());
        ((ClassPathXmlApplicationContext)ctx).close();
    }
}
