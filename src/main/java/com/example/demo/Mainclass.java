package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass {

    public static void main(String[] args) {
		
		  // Creating the application context and registering the configuration class
		  AnnotationConfigApplicationContext context = new
		  AnnotationConfigApplicationContext();
		  
		  context.register(MyConfiguration.class);
		  context.refresh();
		 
		  System.out.println(context.getBean(Employee.class));
    	context.close();
		
		
		   Object obj = context.getBean("employee2"); Employee employee = (Employee) obj;
		  System.out.println(employee);
		  
		  context.close();
		 
    
}

}