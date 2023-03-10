package com.controlStructures;

import java.util.Scanner;

public class Whiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the Number: ");
		int num = input.nextInt();
		while(num>=0) {
			sum+=num;
			System.out.println("Enter the Number: ");
			num = input.nextInt();
			}
			input.close();
			System.out.println("The sum of Positive Numbers"+sum);
	}
	          

}
