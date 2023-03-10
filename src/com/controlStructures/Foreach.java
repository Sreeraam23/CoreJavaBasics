package com.controlStructures;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {23,45,3,4,50};
		int sum = 0;
		for(int num:arr) {
			sum+=num;
		}
		System.out.println("Sum of the given elements in the array: "+sum);
	}

}
