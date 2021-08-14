/*Write program to generate equated monthly installments (EMI) of 3 year
 and 5 year of amount 161258/-*/
package com.training;

public class JPR18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int principle= 161258;
		double rate =0.05d;
	      double EMI;
	      int time=3; //Time is 3 years 
	      int time1=5; //Time is 5 years 
	      rate=rate/(12*100);
	      
	      //The EMI generated for 3 years
	      time=time*12; 
	      EMI= (principle*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
	      System.out.print(" EMI for 3 years is= "+EMI+"\n");
	      
	      //The EMI generated for 5 years
	      time1=time1*12;
	      EMI= (principle*rate*Math.pow(1+rate,time1))/(Math.pow(1+rate,time1)-1);
	      System.out.print(" EMI for 5 years is= "+EMI+"\n");
	      
	      
	      
	}

}
