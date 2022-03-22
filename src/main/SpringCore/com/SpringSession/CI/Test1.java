package com.SpringSession.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1
{
    public static void main(String[] args) {
        System.out.println("hello");

        ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringSession/CI/ciconfig.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p);
    }
}
