package com.controlStructures;

import java.util.Scanner;

public class IfelseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Testscore: ");
		int marks = input.nextInt();
		input.close();
		if(marks>=90) {
			System.out.println("A");
		}
		else if(marks>=80) {
			System.out.println("B");
		}
		else if(marks>=70) {
			System.out.println("C");
		}
		else if(marks>=60) {
			System.out.println("D");
		}
		else if(marks>=50) {
			System.out.println("E");
		}
		else {
			System.out.println("F");
		}
	}

}
