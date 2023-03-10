package com.oopsSample;

public abstract class AuditStudent extends Student {
	String name;
	String Location;
	public AuditStudent() {
		
	}
	public AuditStudent(String name,String Location) {
		this.name = name;
		this.Location = Location;
	}
	
	
	
	public void goToClass() {
		System.out.println(this.name+" is an Audit Student should go to this location "+this.Location);
	}
}
