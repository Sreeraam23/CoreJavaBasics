package com.classesAndObjects;

public class Kid {
	String name;
	int age;
	public Kid(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void play() {
		System.out.println(this.name+"is Playing....");
	}
	public void printKid() {
		System.out.println(this.age+"is Playing....");
	}
	public void printKid(String name,int age) {
		System.out.println(name+"is Playing.... and age is"+age);
	}
}
