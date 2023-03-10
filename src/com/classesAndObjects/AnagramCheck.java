package com.classesAndObjects;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int flag = 0;
		System.out.println("Enter the first string: ");
		String str1 = input.next();
		System.out.println("Enter the second string: ");
		String str2 = input.next();
		input.close();
		if(str1.length() != str2.length()) {
			System.out.println("Not an Anagaram");
		}
		else {
		str1 = str1.toLowerCase().replace(" ", "");
		str2 = str2.toLowerCase().replace(" ", "");;
		char[] chars1 = str1.toCharArray();
	    char[] chars2 = str2.toCharArray();
	    Arrays.sort(chars1);
	    Arrays.sort(chars2);
	    for (int i = 0; i < chars1.length; i++) {
	        if (chars1[i] != chars2[i]) {
	            flag++;	            
	        }
	    }

	    if(flag>0) {
	    	System.out.println("Not an Anagaram");
	    }
	    else {
	    System.out.println("Anagaram");
	    }
	    
		}
	}
	




}
