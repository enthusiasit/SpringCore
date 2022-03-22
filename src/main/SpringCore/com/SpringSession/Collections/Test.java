package com.SpringSession.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello");

        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringSession/Collections/cconfig.xml");
       Emp emp = (Emp) context.getBean("Employee");
        System.out.println(emp);
    }
}
