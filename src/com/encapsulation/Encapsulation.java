//encapsulation is used to set the values / condition of fields in setter method
package com.encapsulation;

public class Encapsulation {
   private int rollnumber;

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
		if(rollnumber>=0) {
			System.out.println(rollnumber);
			
		}
		else {
			System.out.println("Rollnumber is not negative");
		}
	}
     
     public static void main(String[] args) {
    	 Encapsulation e = new Encapsulation();
    	 e.setRollnumber(12);
     }
	
}
