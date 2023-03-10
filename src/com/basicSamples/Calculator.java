package com.basicSamples;

public class Calculator {
	int num; //instanious var
	static int c = 1;  //class variable
	final double pi = 3.14;
	public void add(int a,int b) {
		int sum =a+b; //local variable
		System.out.println(sum);
	}
	public void area(int radius) {
		System.out.println("Area of the circle"+pi*radius*radius);
	}
	public void area(int length,int breadth) {
		System.out.println("Area of the circle"+pi*length*breadth);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.num=10;
		System.out.println(cal.num);
		c=11;
//		System.out.println(cal.c+"C");
		System.out.println();
		cal.add(11, 12);
		
	}

}
