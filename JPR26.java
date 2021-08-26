/**
 * 
 */
package com.google;

/**
 * @author Madhav
 *
 */
public class JPR26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 inter ob=new Operate();
		 ob.add();
		 ob.sub();
		 ob.mul();
		 ob.div();
	}

}

interface inter
{

	int a=60;
	int b=30;
	public void add();
	public void sub();
	public void mul();
	public void div();


}// end inter

// operate class implements inter

class Operate implements inter
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

}//end opearate