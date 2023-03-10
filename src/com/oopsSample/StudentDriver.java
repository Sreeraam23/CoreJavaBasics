package com.oopsSample;

import java.util.ArrayList;

public class StudentDriver  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1 = new Student(" Peter ");
//		Student s2 = new Student("Weiner ",23);
//		Student s1 = new PayingStudent(" Carlo ",9.2f);
		PayingStudent s1 = new PayingStudent(" Peter ",9.2f);
		CompanyStudent s2 = new CompanyStudent(" John ","Zuci");
		Student s3 = new PayingStudent(" Wicky ",8.2f); 
		Student s4 = new CompanyStudent(" Raj ","Zuci");
		AuditStudent s5 = new Audit2("Sanjay "," Auditorium1 ");
		
		StudentList students = new StudentList();
		students.addStudent(s1);
		students.addStudent(s2);
		students.addStudent(s3);
		students.addStudent(s4);
		students.addStudent(s5);
		System.out.print("Displaying");
		ArrayList<Student> studs = students.getStudents();
		for(Student stud:studs) {
			stud.goToClass();
			System.out.println(stud.toString());
			stud.calculateGPA();
			stud.PrintMarksheet();
			
		}
		
		
	}
	
}
