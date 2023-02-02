package com.StaticKeyWord;

public class StaticKeyWord2 {
	 int a=10;
	 static int b = 10;
   public static void main(String[] args) {
	  

	   StaticKeyWord2 s = new StaticKeyWord2();
		System.out.println("non static a>>" + s.a++);
		System.out.println("static b>>" + s.b++);
		StaticKeyWord2 s1 = new StaticKeyWord2();
		System.out.println("non static a>>" + s1.a++);
		System.out.println("static b>>" + s1.b++);
		StaticKeyWord2 s2 = new StaticKeyWord2();
		System.out.println("non static a>>" + s2.a++);
		System.out.println("static b>>" + s2.b++);
		

   }
}
