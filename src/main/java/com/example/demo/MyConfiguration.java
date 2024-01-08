package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {


	@Bean
	public Employee Beans() {
		Employee emp = new Employee();
		emp.setId(111);
		emp.setName("anjan");
		emp.setAddress("7101 Virginia parkway");
		return emp;
	}
	
	@Bean
	public Employee Beansone() {
		Employee emp = new Employee();
		emp.setId(111);
		emp.setName("anjan");
		emp.setAddress("7101 Virginia parkway");
		return emp;
	}
	
	@Bean
	public Employee Beancomponent() {
		Employee emp = new Employee();
		emp.setId(111);
		emp.setName("anjan");
		emp.setAddress("7101 Virginia parkway");
		return emp;
	}



}
