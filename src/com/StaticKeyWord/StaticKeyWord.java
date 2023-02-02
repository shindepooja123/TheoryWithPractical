package com.StaticKeyWord;

public class StaticKeyWord {
	
	static int a = 5;

public static void main(String[] args) {
	
	   System.out.println("by variable name" +a);
	   
	   System.out.println("by class name" +StaticKeyWord.a);
	   
	   StaticKeyWord s= new StaticKeyWord();
	   System.out.println("by object name" +s.a);
   }
}
