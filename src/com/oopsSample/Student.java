package com.oopsSample;

public  class Student implements PrintStudent{

		String name;
		String address;
		float gpa;
		public Student(String name) {
			this.name = name;
		}
		public Student() {
			
		}
		public Student(String name,float gpa) {
			this.name = name;
			this.gpa = gpa;
		}
		public  void goToClass() {
			System.out.println(this.name+"should go to class");
		}
//		public abstract String toString();
		public final void calculateGPA() {
			System.out.println("Calculate the GPA"+this.gpa);
		}
		public void  PrintMarksheet() {
			int marks = 400;
			System.out.println("Marks: "+marks/subjects);
		}
	}


