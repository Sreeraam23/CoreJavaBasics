package com.oopsSample;

public class PayingStudent extends Student{
	//Default constructor will be inherited in inheritence if there's no default constructor it would show error
	boolean madePayment;
	public PayingStudent(String name, float gpa) {
		super();
		this.name = name;
		this.gpa = gpa;

	}
	public PayingStudent(String name) {
		this.name = name;
	}
	public void goToClass() {
		System.out.println("Paying class student "+this.name);
	}
	public String toString() {
		return "Paying Student name is 	"+this.name; 
	}
	
}
