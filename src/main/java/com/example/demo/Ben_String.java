package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ben_String {
	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		/*
		 * Object obj = context.getBean("Beansone"); Employee emp = (Employee) obj;
		 * System.out.println(emp.getAddress()); System.out.println(emp.getId());
		 * System.out.println(emp.getName());
		 */
		
		Employee emps = (Employee)context.getBean("Beansone");
		System.out.println(emps.getAddress());
		System.out.println(emps.getId());
		System.out.println(emps.getName());
		
		
	}

}
