package com.oopsSample;

import java.util.ArrayList;

public class StudentList {

		ArrayList<Student> studList;
		public StudentList() {
			System.out.println("Creating new Student list...");
			studList  = new ArrayList<>();
		}
		public void addStudent(Student student) {
			System.out.println("Add Student to the List....");
			studList.add(student);
		}
		public ArrayList<Student> getStudents() {
			return studList;
		}
	}


