package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
private int id;
private String name;
private String address;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
}

public Employee() {
	System.out.println("this is the constructor injection with null arguments");
	
}
public Employee(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	
	System.out.println("This is the constructor injection with the three arguments");
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
	System.out.println("setter injection of id");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("setter injection of name");
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
	System.out.println("setter injection of address");
}

}
