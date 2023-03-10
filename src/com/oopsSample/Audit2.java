package com.oopsSample;

public class Audit2 extends AuditStudent implements PrintStudent{
	String name;
	String Location;
	public Audit2(String name,String Location) {
		this.name = name;
		this.Location = Location;
	}
	public Audit2(String name) {
		this.name = name;
	}
	
	public void goToClass() {
		System.out.println(this.name+" is an Audit Student should go to this location "+this.Location);
		
	}
	public String toString() {
		return "Audit Student name is "+this.name; 
	}
	public void  PrintMarksheet() {
		int marks = 400;
		System.out.println("Marks: "+marks/subjects);
	}
}
