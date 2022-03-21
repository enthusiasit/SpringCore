package com.SpringSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        System.out.println("hello world");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Student student1 = (Student) context.getBean("Student1");
        System.out.println(student1);
    }
}
