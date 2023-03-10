package com.basicSamples;

import java.util.Scanner;

public class ConsoleInSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int num = input.nextInt();
		System.out.println("Integer: "+num);
		System.out.print("Enter a float: ");
		float f = input.nextFloat();
		System.out.println("Float: "+f);
		System.out.print("Enter a double: ");
		double d = input.nextDouble();
		System.out.println("Double"+d);
		System.out.print("Enter a string: ");
		String str = input.next();
		System.out.println("String"+str);
		
		input.close();
	}

}
