package com.turbopass;

import java.util.HashSet;
import java.util.Iterator;

class Employee {

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
class EmployeeDB {
	Employee[] emp = new Employee[30];
	
	public int addEmployee(int id, String name, double sal,int count) {
		for (int i = 0; i < emp.length; i++) {
			if(emp[i].getId()==id){
				emp[count]=(new Employee(id, name, sal));
				return 1;
			}
			//return 0;
		}
		return 0;
	}
	
	public Employee getEmployee(int id) {
		/*Iterator<Employee> empIterator = emp.iterator();
		while(empIterator.hasNext()) {
			Employee e = empIterator.next();
			if(e.getId()==id)
				return e;
		}*/
		for (int i = 0; i < emp.length; i++) {
			if(emp[i].getId()==id){
				return emp[i];
			}
		}
		return null;
	}
}

public class DictWithoutCol {
	public static void main(String[] args) {
		EmployeeDB edb = new EmployeeDB();
		
		System.out.println(edb.addEmployee(1, "abc", 10000,0));
		System.out.println(edb.addEmployee(1, "abc", 10000,1));
		System.out.println(edb.getEmployee(1));
		System.out.println(edb.getEmployee(2));
	}
}
