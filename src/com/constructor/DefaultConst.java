//we can not overrid default constructor , parametrized constructor can be overload
//we can not override 
package com.constructor;

public class DefaultConst {
 String city;
 public DefaultConst() {
	 city="pune";
 }

 
 public static void main(String[] args) {
	 DefaultConst d = new DefaultConst();
	 System.out.println("name of the city is >>" +d.city);
	 
 }
}
