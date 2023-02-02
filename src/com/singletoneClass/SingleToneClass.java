//private constructor
//Singletone class:A class witch allowed us to create only one object is called 
//as singleton class
package com.singletoneClass;

class SingleToneClass {
	static SingleToneClass st = new SingleToneClass();

	SingleToneClass() {
		System.out.println("constructor will invoke for only on object");
	}

	static SingleToneClass getInstance() {
		return st;
	}
}

class test {
	public static void main(String[] args) {
		SingleToneClass st1 = new SingleToneClass();

	}
}
