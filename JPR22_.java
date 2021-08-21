/**- Perform Arithmetic operation for Method Overloading & Overriding
 * 
 */
package com.training;

/**
 * @author Vaishnavi
 *
 */
public class JPR22_ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition ob1 =new Addition();
		Substraction ob2 =new Substraction();
		Multiplication ob3=new Multiplication();
		Division ob4 = new Division();
		
		System.out.println("Addition :" +ob1.operation(42,31));
		System.out.println("Addition :" +ob1.operation(42,31,56));
		System.out.println("Addition :" +ob1.operation(42,31,56,67));
		
		System.out.println("Substraction :" +ob2.operation(42,31));
		System.out.println("Substraction:" +ob2.operation(48,12,3));
		System.out.println("Substraction:" +ob2.operation(76,12,6,2));
		
		System.out.println("Multiplication:" +ob3.operation(42,12));
		System.out.println("Multiplication:" +ob3.operation(42,14,32));
		System.out.println("Multiplication:" +ob3.operation(42,24,34,12));
		
		System.out.println("Division:" +ob4.operation(45,5));
	}

} 

//method overloading example 
class Addition
{
	int operation(int a, int b)
	{
		return a+b;
	}
	
	
	int operation(int a, int b, int c)
	{
		return a+b+c;
	}
	
	int operation(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}

} // class method overloading


// method overriding example

class Substraction extends Addition 
{
		int operation(int a,int b)
		{
			return a-b;
		}
		
		int operation(int a,int b, int c)
		{
			return a-b-c;
		}
		
		int operation(int a,int b, int c,int d)
		{
			return a*-b-c-d;
		}
	
}

class Multiplication extends Addition 
{
	int operation(int a,int b)
	{
		return a*b;
	}
	
	int operation(int a,int b, int c)
	{
		return a*b*c;
	}
	
	int operation(int a,int b, int c,int d)
	{
		return a*b*c*d;
	}
}

class Division extends Addition
{
	int operation(int a,int b)
	{
	return a/b;
	}
}
	


