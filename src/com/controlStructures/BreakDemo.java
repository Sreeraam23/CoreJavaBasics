package com.controlStructures;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {23,456,77,234,45,7,4356,12,3455,654};
		int searchfor = 12;
		int i = 0;
		boolean foundit = false;
		for (; i < arr.length; i++) {
			if(arr[i]== searchfor) {
				foundit = true;
				break;
			}
			
		}
		if(foundit) {
			System.out.println("The number is found in the index of: "+i);
		}
		else {
			System.out.println("Not in the array");
		}
	}

}
