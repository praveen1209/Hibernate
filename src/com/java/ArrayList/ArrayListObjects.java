package com.java.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListObjects {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student std=new Student();
		
		std.setId(01);
		std.setName("praveen");
		std.setCountry("Usa");
		std.setCity("fremont");
		
		
Student std1=new Student();
		
		std1.setId(01);
		std1.setName("praveen");
		std1.setCountry("Usa");
		std1.setCity("fremont");
		
		list.add(std);
		list.add(std1);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getClass());
		
	}
}
		
		
		
	
	
	

