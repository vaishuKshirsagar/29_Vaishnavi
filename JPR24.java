/**
 * 
 */
package com.training;

/**
 * @author Vaishnavi
 *
 */
public class JPR24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1 = new Apple();
		a1.display();
		a1.show();
		
		Development d1 = new Development();
		d1.display();
		d1.show();
		
		Design de1 = new Design();
		de1.display();
		de1.show();
		
		Testing t1 = new Testing();
		t1.display();
		t1.show();
		
		Sales s1 = new Sales ();
		s1.display();
		s1.show();
		
		Accounts ac1 = new Accounts();
		ac1.display();
		ac1.show();
		
		
	}

}

class Apple
{
	String company = "Apple";
	String role = "To provide best customer services ";
	void display()
	{
		System.out.println("Welcome to " +company);
		
		
	}
	
	void show()
	{
		System.out.println("The role of our company is "+role);
	}
	
}

// single inheritance 
class Development extends Apple
{
     	String role ="To develop the best software";
     	void display()
     	{
     		System.out.println("Welcome to the Development deaprtment");
     		
     	}
     	
     	void show()
     	{
     		System.out.println("Our role is "+role);
     		
     	}

}

// multilevel inheritance
class Design extends Development
{
        String role= "To design creative and effective project";
        void display() 
        {
        	System.out.println("Welcome to the Design department");
        	
        }
        
        void show()
        {
        	System.out.println("Our role is "+role);
        }
}

// hierarchical inheritance
class Testing extends Apple
{
	String role = "To test the product and deploy it";
	void display()
	{
		System.out.println("Welcome to the Testing department");
	}
	
	void show()
	{
		System.out.println("Our role is "+role);
		
	}
	
}

class Sales extends Apple
{
	String role = "To build relationship with customer";
	void display()
	{
		System.out.println("Welcome to the Sales department");
	}
	
	void show()
	{
		System.out.println("Our role is "+role);
		
	}
	
}

// Single inheritance 
class Accounts extends Apple
{
    String role ="To keep record of cash recieved and sales";
    void display()
	{
		System.out.println("Welcome to the Account department");
	}
	
	void show()
	{
		System.out.println("Our role is "+role);
		
	}

}



