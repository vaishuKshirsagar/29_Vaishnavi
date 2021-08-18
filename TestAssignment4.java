/* convert a percentage to a fraction (To convert a percentage into fraction let say 30%
 *  to a fraction)
 */

package com.Itrassignment;

public class TestAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The fraction format of 30% is 30/100
		int nume=30;
		int deno=100;
		
		//Divide the numerator and denominator by common factor
		int CommonFact=10;
		int Numer=nume/CommonFact;
		int Denom=deno/CommonFact;
		
		System.out.println("The 30% in Fraction is "+Numer +"/"+Denom);
				
	}

}
