package com.encapsulation;

import java.util.Scanner;

public class Encapasulation2 {
	public static void m1() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the id");
		int numer = s.nextInt();
		System.out.println("enter the name");
		String name = s.next();
	    
		Enacpasulation1 e = new Enacpasulation1();
		e.setStudId(numer);
		e.setName("name");
	
	System.out.println("student id>>" +e.getStudId());
	System.out.println("student name>>" +e.getName());
	}

	public static void main(String[] args) {
		m1();
	}
	
}