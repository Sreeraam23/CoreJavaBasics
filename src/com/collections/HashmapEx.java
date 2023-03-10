package com.collections;

import java.util.HashMap;
import com.oopsSample.Audit2;
import com.oopsSample.CompanyStudent;
import com.oopsSample.PayingStudent;
import com.oopsSample.Student;
public class HashmapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Student> stud = new HashMap<>();
		Student s1 = new PayingStudent("Arun");
		Student s2 = new CompanyStudent("Bala");
		Student s3 = new Audit2("Carlo");
		Student s4 = new CompanyStudent("Bhalan");
		Student s5 = new PayingStudent("Varun");
		stud.put(01, s1);
		stud.put(02, s2);
		stud.put(03, s3);
		stud.put(04, s4);
		stud.put(05, s5);
		System.out.println("Hashmap :"+stud);
		stud.remove(05);
		System.out.println("Hashmap :"+stud);
  	}

}
