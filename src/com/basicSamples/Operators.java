package com.basicSamples;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 14, b = 6;

	    // addition 
	    System.out.println("a + b = " + (a + b));

	    // subtraction 
	    System.out.println("a - b = " + (a - b));

	    // multiplication 
	    System.out.println("a * b = " + (a * b));

	    // division 
	    System.out.println("a / b = " + (a / b));

	    // modulo 
	    System.out.println("a % b = " + (a % b));
	    
	 // && operator
	    System.out.println((5 > 3) && (8 > 5));  
	    System.out.println((5 > 3) && (8 < 5));  

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  
	    System.out.println((5 > 3) || (8 < 5));  
	    System.out.println((5 < 3) || (8 < 5));  

	    // ! operator
	    System.out.println(!(5 == 3));  
	    System.out.println(!(5 > 3));  
	    
	    //Ternary Operator
	    int feb = 29;
	    String res;
	    res = (feb == 28)?"Not a Leap Year":"Leap Year";
	    System.out.println(res);
	    }

}
