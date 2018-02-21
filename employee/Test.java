package com.employee;

public class Test {
	public static void main(String[] args) {
		EmployeeDB edb = new EmployeeDB();
		System.out.println(edb.addEmployee(1, "abc", 10000));
		System.out.println(edb.addEmployee(1, "abc", 10000));
		System.out.println(edb.getEmployee(1));
		System.out.println(edb.getEmployee(2));
	}
}
