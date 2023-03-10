package com.controlStructures;

public class Switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		int month = 2;
		switch (month) {
		case 1:
			System.out.println("January Month");
			break;
		case 3:
			System.out.println("March Month");
			break;
		case 5:
			System.out.println("May Month");
			break;
		case 7:
			System.out.println("July Month");
			break;
		case 9:
			System.out.println("September Month");
			break;
		case 10:
			System.out.println("October Month");
			break;
		case 12:
			System.out.println("December Month");
			break;
		case 2:
			if((year%4 == 0)&& !(year %100  == 0)|| (year %400  == 0))
				System.out.println("Number of Days in February is 29 and it is a Leap Year");
			else
				 System.out.println("Number of Days in February is 28 and it is  Not a Leap Year");
			break;

		default:
			System.out.println("Not a valid Month");
			break;
		}
	}

}
