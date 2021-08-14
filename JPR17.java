/*Write program to calculate monthly simple interest and compound interest
 (5% per Month) on amount - 161258/-*/
package com.training;

public class JPR17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p=161258; // principle
		float r=0.05f; //rate of interest
		int t=3; // Time 
		double sinterest, cinterest;
		
		//Simple interest=(p*r*t)/(100*12)
		
	sinterest= (p*r*t)/(100*12);
	System.out.println("The amount of simple interest will be " +sinterest);
	
	    //Compound interest
	   //A=p*[1+(R/n)] , compound interest=A-P
	//compound Interest =p*((1 + 0.05 / 12)^12) (12 *1) –p
	
	cinterest=p*Math.pow(1+(r/12),12)-p;
	System.out.println("The amount if compound interest will be " +cinterest);
	
	}

}
