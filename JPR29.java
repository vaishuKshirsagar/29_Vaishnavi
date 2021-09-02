/**
 * 
 */
package com.google;

/**
 * @author Vaishnavi
 * 
 * program for arithmetic operation using  java exception handling mechanism
 */
public class JPR29 {

	/**
	 * @param args
	 */
	
	
	
	void exceptionHandling()
	{
		try {

			int x=0;
			int y=55;
			int res=y/x;
			System.out.println("The division is "+res);

		}

		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception occured "+ae);

		}
		
		finally {
			System.out.println("This is a Finally block");
		}
		
		System.out.println("Out of the try catch");
		


	} // end of exceptionHandling()
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JPR29 ob = new JPR29();
		ob.exceptionHandling(); // invoking the method
	} //end of main method

} // end class

/*Output 
 *  Arithmetic Exception occured java.lang.ArithmeticException: / by zero
 *  This is a Finally block
 *  Out of the try catch  
 *  */
