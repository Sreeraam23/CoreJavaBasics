package com.controlStructures;

public class Fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5
		//00 01 10 11 12 23
		int num = -1;
		int num1 = 1;
		int sum = 0;
		for(int i = 0;i<7;i++) {
			sum = num+num1;
			num = num1;
			num1 = sum;
			System.out.print(sum+" ");
	}

}
}
