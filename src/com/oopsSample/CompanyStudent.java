package com.oopsSample;

public class CompanyStudent extends Student{
	String companyname;
	public CompanyStudent(String name,String companyname){
		this.name = name;
		this.companyname = companyname;
		}
	public CompanyStudent(String name) {
		this.name = name;
	}
	
	public void goToClass() {
		System.out.println("Company student "+this.name);
	}
	public String toString() {
		return "Company Student name is "+this.name; 
	}
	
}
