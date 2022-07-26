package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/config.xml");
        Employee employee = context.getBean("emp",Employee.class);
        System.out.println(employee);
    }
}
