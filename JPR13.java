// Swap two numbers using temporary variable
package com.training;

public class JPR13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int firstNo = 12;
		int secondNo = 10;
	    int temp;
	   
	    System.out.println("The values before swap " +"FirstNo is "+firstNo +" SecondNo is "+secondNo);
	   
	    temp = firstNo;
	    firstNo= secondNo;
	    secondNo= temp;
				
	    System.out.println("The values after swap " +"FirstNo is "+firstNo +" SecondNo is "+secondNo);
		
	}

}
