package com.basics.advance1;

public class Employee {

	private int empId;
	private String emapName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmapName() {
		return emapName;
	}
	public void setEmapName(String emapName) {
		this.emapName = emapName;
	}
	public Employee(int empId, String emapName) {
		super();
		this.empId = empId;
		this.emapName = emapName;
	}
	
}
