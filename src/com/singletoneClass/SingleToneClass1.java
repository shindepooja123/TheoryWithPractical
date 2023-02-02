package com.singletoneClass;

public class SingleToneClass1 {
  public static void main(String[] args) {
	  SingleToneClass st1= new SingleToneClass().getInstance();
	  SingleToneClass st2= new SingleToneClass().getInstance();
  }
}
