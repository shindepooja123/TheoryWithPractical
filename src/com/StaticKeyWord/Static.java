package com.StaticKeyWord;

public class Static {
     static{
    System.out.println("this is first block");    	 
     }
     
     static {
    	 int a=112;
    	 int b=154;
    	 System.out.println(+a+b);
    	 
     }
     
     public static void main (String[] args) {
    	 System.out.println("this is main method");
     }
     
     
     static {
    	 System.out.println("this 2 block");
     }
     
     static {
    	 System.out.println("this is 3 block");
     }
}
