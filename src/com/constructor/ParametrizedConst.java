package com.constructor;

public class ParametrizedConst {
	int Rollnum;
	String Name;
	String City;

	public ParametrizedConst(int Rollnum, String Name, String City) {
		Rollnum = Rollnum;
		Name = Name;
		City = City;

		System.out.println("roll number of student >> " + Rollnum);
		System.out.println("Name of student >> " + Name);
		System.out.println("city of of student >> " + City);
	}
	
	public ParametrizedConst( String Name, String City) {
		
		Name = Name;
		City = City;

	
		System.out.println("Name of student >> " + Name);
		System.out.println("city of of student >> " + City);
	}

	public static void main(String[] args) {
		ParametrizedConst p = new ParametrizedConst(1, "pooja", "pune");
		ParametrizedConst p1 = new ParametrizedConst( "dumi", "belagav");

	}
}
