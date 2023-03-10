package com.classesAndObjects;

import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[5];
		for(int i = 0;i<arr.length;i++) {
			System.out.print("Enter the array element for the index "+i+":");
			arr[i] = s.nextInt();
		}
		System.out.println("Accessing arrays manually!");
		s.close();
		System.out.println("Index 0: "+arr[0]);
		System.out.println("Index 1: "+arr[1]);
		System.out.println("Index 2: "+arr[2]);
		System.out.println("Index 3: "+arr[3]);
		System.out.println("Index 4: "+arr[4]);
		System.out.println("Accessing arrays through loops!!");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
			}
		
		System.out.println("\nAccessing elements through enhanced for loop");
		for(int index:arr) {
			System.out.print(index+" ");
		}
		float avg = sum/arr.length; 
		System.out.println("\nThe average of the elements in the array: "+avg);
	}

}
