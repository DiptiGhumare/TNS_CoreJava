package com.tnsifdayone;

public class StudentDriver1 {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.rollNo = 11;
		s1.name = "Dipti";
		s1.m1 = 55;
		s1.m2 = 92;
		s1.m3 = 69;
		s1.show();
		
		Student s2=new
		Student(101, "Hrutika", 78, 65, 90);
		
		s2.show();
		

	}

}
