package com.philimonov.spring.rest;

import com.philimonov.spring.rest.configuration.MyConfig;
import com.philimonov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1300);
        employee.setId(8);
        communication.saveEmployee(employee);

    }
}
