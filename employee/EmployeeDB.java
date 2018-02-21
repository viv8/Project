package com.employee;

import java.util.HashSet;
import java.util.Iterator;

import com.employee.Employee;

public class EmployeeDB {
	HashSet<Employee> emp = new HashSet<Employee>();
	
	public int addEmployee(int id, String name, double sal) {
		if(emp.add(new Employee(id, name, sal)))
			return 1;
		return 0;
	}
	
	public Employee getEmployee(int id) {
		Iterator<Employee> empIterator = emp.iterator();
		while(empIterator.hasNext()) {
			Employee e = empIterator.next();
			if(e.getId()==id)
				return e;
		}
		return null;
	}
}
