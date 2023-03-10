package com.controlStructures;

public class Fordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {23,45,3,4,5};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of the elements in the array"+sum);
	}

}
