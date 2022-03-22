package com.SpringSession.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("good Evening");

        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringSession/Ref/refconfig.xml");
       A temp = (A) context.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());

        System.out.println(temp);
    }
}
