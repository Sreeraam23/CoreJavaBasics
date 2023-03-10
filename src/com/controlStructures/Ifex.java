package com.controlStructures;

public class Ifex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aNumber = 3;
		if(aNumber>=0) {	//outer If
			if(aNumber == 0) {		//Inner If
				System.out.println("First String");
			}
		}
		else {	//outer else
			System.out.println("Second String");
		}
		
			System.out.println("Third String");
	}

}
