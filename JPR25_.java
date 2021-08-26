/**
 * 
 */
package com.google;

/**
 * @author Vaishnavi
 *
 */
public class JPR25_ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		operation a= new result();
		a.add();
		a.sub();
		a.mul();
		a.div();
	}

}

abstract class operation
	{
		 int a=60;
		 int b=30;
		 //abstract methods
		public abstract void add();
		public abstract void sub();
		public abstract void mul();
		public abstract  void div();
	}
	 

	 //class result extends operation class
	class result extends operation
	{
		public void add()
		{
		 System.out.println("Addition is "+(a+b));
		}
		public void sub()
		{

			 System.out.println("Substraction is "+(a-b));
		}
		public void mul()
		{

			 System.out.println("Multiplication is "+(a*b));
		}
		public void div()
		{

			 System.out.println("Division is "+(a/b));
		}

	}

