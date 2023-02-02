package com.inheritance;

public class MainTest {
 public static void main(String[] args) {
	// Scenario- 1 by creating the object of A class i.e parent class
	/* A i = new A();
	 System.out.println(i.a);
	 System.out.println(i.b);
	 i.m1();
	 i.m2();*/
	
	// Scenario- 2 by creating the object of B class i.e child class
	 
	/* B j = new B();
	 System.out.println(j.a);
	 System.out.println(j.b);
	 System.out.println(j.r);
	 System.out.println(j.s);
	 
	 j.m1();
	 j.m2();
	 j.m3();
	 j.m4();*/
	 
	// Scenario- 3 child class reference new B() to parent class
	 A m= new B();
	 System.out.println(m.a);
	 System.out.println(m.b);
	
	
	 m.m1();
	 m.m2();
	
 }
}
