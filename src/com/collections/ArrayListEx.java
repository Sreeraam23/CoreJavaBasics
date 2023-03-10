package com.collections;

import java.util.ArrayList;

import com.oopsSample.Audit2;
import com.oopsSample.CompanyStudent;
import com.oopsSample.PayingStudent;
import com.oopsSample.Student;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud = new ArrayList<>();
		Student s1 = new PayingStudent("Arun");
		Student s2 = new CompanyStudent("Bala");
		Student s3 = new Audit2("Carlo");
		Student s4 = new CompanyStudent("Bhalan");
		Student s5 = new PayingStudent("Varun");
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		stud.add(s5);
		System.out.println("ArrayList:   "+stud);
		stud.remove(3);
		System.out.println("After removing ArrayList:   "+stud);
		for(Student st:stud) {
			System.out.println(st);
		}
		
		
		
	}

}
