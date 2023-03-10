package com.classesAndObjects;

import java.util.Scanner;

public class InitialsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter your full name with initial: ");
	    String fullName = scan.nextLine();
	    String[] words = fullName.split(" ");
	    String initial = "";
	    scan.close();
	    for (String word : words) {
	      initial += word.charAt(0);
	    }
	    System.out.println("Intial: "+" "+initial+" ");
	  }

}
