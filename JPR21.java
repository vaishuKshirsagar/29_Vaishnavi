/**
 * 
 */
package com.training;

/**
 * @author Vaishnavi
 *
 */
public class JPR21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an instance for class
		Operation op1= new Operation();
		
		//invoking an instance method 
		op1.WoutRetNoArg();
		op1.WithRetNoArg();
		op1.WoutRetwidArg(16, 2);
		op1.WithRetWidArg(50,25);
		
		//invoking static method using classname
		Operation.show(); 
		
		// invoking a static method by creating an object 
		Operation Ope1 = new Operation(); 
	    Ope1.Smethod();
		 
	}

}

class Operation
{
      
	int a=10;
	int b=27;
	
	
	//method without return type without argument
	void WoutRetNoArg()
	{
		int c=a+b;
		System.out.println("Addition of a and b is "+c);
		
	}
	
	//method with return type and without argument 
	
	int WithRetNoArg()
	{
		int c=a-b;
		System.out.println("Substraction of a and b is " +c);
		return c;
	}

	//method without return type and with argument 
	
     void WoutRetwidArg(int a ,int b)
	{
		int c=a*b;
		System.out.println("Multiplication of a and b is "+c);
		
	}
	
	//method with return type and with argument
	
	 float WithRetWidArg(int a , int b)
	{
	
		float c=a/b;
		System.out.println("Division of a and b is "+c);
		return c;
	
    }
	 
	 //static method 
	 
	 static void Smethod()
	 {
		 String name="Vaishnavi ";
		 System.out.println("Hi my name is " +name);
	 
	 }
	 
	 //invoking a static method in static method
	 
	 static void show()
	 {
		 Operation.Smethod();//invoking a static method using a class name 
		 
	 }


}


