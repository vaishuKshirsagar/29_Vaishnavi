/**
 * 
 */
package com.google;

/**
 * @author Vaishnavi
 *
 * program to check voter person age is eligible or not using java exception 
 * handling mechanism
 */
public class JPR30 {

	/**
	 * @param args
	 */
	
	//method to check if person is eligible to vote or not  
	void checkEligibility(int age)
	{
		try {
			if (age<18) {
				 
				//throw Arithmetic exception if not eligible to vote 
				throw new ArithmeticException("You are not eligible to vote");
			}
			
			else {
				System.out.println("You are eligible to vote");
			}
					
		} // end try block
		
		catch(ArithmeticException ae) {
			
			System.out.println("Arithmetic Exception occured  "+ae);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JPR30 ob = new JPR30();
       ob.checkEligibility(16); // calling the method
	} // end main

} // end class


/* Output:
 * Arithmetic Exception occured  java.lang.ArithmeticException: You are not eligible to vote
 * */
