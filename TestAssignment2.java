/*Assign String to x variable in DD-MM-YYYY format
   extract and print Year from String.*/
package com.Itrassignment;

public class TestAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="18/08/2021";
		
		
		 String y= x.split("/")[2];
		
		System.out.println("Year is "+y);
	}

}
