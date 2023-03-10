package com.collections;

import java.util.HashSet;
import java.util.*;

public class HashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> evenNumber = new HashSet<>();
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		evenNumber.add(8);
		evenNumber.add(6);
		System.out.println("HashSet: "+evenNumber);
		Iterator<Integer> iterate = evenNumber.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			if(iterate.hasNext()) {
				System.out.print(", ");
			}
		}
		HashSet<String>empList1 = new HashSet<>();
		empList1.add("John");
		empList1.add("peter");
		empList1.add("Andrew");
		System.out.println("\nList of Employee..."+empList1);
		TreeSet<String>empList = new TreeSet<>();
		empList.add("John");
		empList.add("peter");
		empList.add("Andrew");
		System.out.println("\nList of Employee..."+empList);
		
	}  

}
