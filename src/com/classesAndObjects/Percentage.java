package com.classesAndObjects;

import java.text.NumberFormat;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double percent = new Double (0.75);
		NumberFormat percentFormatter; 
		String percentout;
		percentFormatter = NumberFormat.getPercentInstance(); 
		percentout = percentFormatter.format(percent);
		System.out.println(percentout);
	}

}
