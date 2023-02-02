package com.constructor;

public class ParametrizedConstruct {
	int RollNumer;
	String StudName;
	String StudCity;

	public ParametrizedConstruct(int RollNum, String Name, String City) {

		RollNumer = RollNum;
		StudName = Name;
		StudCity = City;
	}

	public ParametrizedConstruct(String Name, String City) {
		StudName = Name;
		StudCity = City;
	}

	

	@Override
	public String toString() {
		return "ParametrizedConstruct [RollNumer=" + RollNumer + ", StudName=" + StudName + ", StudCity=" + StudCity
				+ "]";
	}

	public static void main(String[] args) {
		ParametrizedConstruct s = new ParametrizedConstruct(1, "Pooja", "Belgavi");
		ParametrizedConstruct s1 = new ParametrizedConstruct("Namasvi", "Belgavi");
		System.out.println(s);
		System.out.println(s1);
	}
}
