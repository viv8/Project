package com.employee;

public class Employee {

	private int id;
	private String name;
	private double sal;
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj;
			return emp.id==id;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Id: "+id+" Name: "+name+" Sal: "+sal;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSal() {
		return sal;
	}
}

