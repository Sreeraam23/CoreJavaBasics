package com.classesAndObjects;

public class EncapsulatedKid {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = (name.length()==0)?"No name":name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age>1 && age<12)?age:2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulatedKid kid = new EncapsulatedKid();
		kid.setAge(4);
		kid.setName("New");
	}

}
