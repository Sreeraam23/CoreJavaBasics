package com.classesAndObjects;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		System.out.println("The reference of str: "+str.hashCode());
		str = str+" Programming";
		System.out.println("The reference of str after appending 1: "+str.hashCode());
		str = str.concat(" Language");
		System.out.println("The reference of str after appending 2: "+str.hashCode());
		System.out.println(str);
		String str1 = new String("C Programming");
		System.out.println("The reference of str1: "+str1.hashCode());
		str1 = str1.concat(" Language");
		System.out.println("The reference of str1 after appending: "+str1.hashCode());
		System.out.println(str1);
		System.out.println(str.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str.toCharArray());
		String res = (str == str1)?"Yes":"No";
		System.out.println(res);
		
		
	}

}
