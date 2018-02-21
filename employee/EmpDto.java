package com.employee;

import java.util.Date;

public class EmpDto {
	private int Id;
	private String Name;
	private String Mailid;
	private String Gender;
	private Date Dob;
	private Double Sal;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMailid() {
		return Mailid;
	}
	public void setMailid(String mailid) {
		Mailid = mailid;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public Double getSal() {
		return Sal;
	}
	public void setSal(Double sal) {
		Sal = sal;
	}
	@Override
	public String toString() {
		return "Id:"+Id+" Name:"+Name+"  MailId:"+Mailid+"  Gender:"+Gender+"  Dob:"+Dob+"  Sal:"+Sal;
	}
}
