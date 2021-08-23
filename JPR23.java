/**
 * 
 */
package com.training;

/**
 * @author Vaishnavi
 *
 */
public class JPR23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentadm S1= new Studentadm(); // invoked default constructor
		Studentadm S2= new Studentadm("Vaishnavi", "TY" ,"CO","11/06/2012", "Solapur", "abv@gmail.com", 4787990);
		
		// default constructor calling
		S1.show();
		
		// invoking method to show details of student S2
		S2.show();
		
		// change the Division
		S2.changeDiv("ME");
		
		// change the Email id
		S2.changeEMail("abc3@gmail.com");
		
		//change the address
		S2.changeAdd("Sangola");
		
		//change the Mobile Number
		S2.changeMob(468748);
		
		//To admit in College
		S2.admit();
		
		//To terminate
		S2.terminate();
		
	}

}

class Studentadm
{
	String name;
	String cls;
    String div;
	String admdate;
	String address;
	String email;
	long mNo;
	// Default constructor  
	
	Studentadm()
	{
		System.out.println("This Default constructor");
		
	} // end default constructor
	
	
	// constructor overloading
	
	Studentadm(String n,String cl, String d)
	{
		name=n;
		cls=cl;
		div=d;
		
	}  
	
	Studentadm(String n, String cl, String d,String admD)
	{
		name=n;
		cls=cl;
		div=d;
		admdate=admD;
				
	}
	
	Studentadm(String n, String cl, String d,String admD, String addr)
	{
		name=n;
		cls=cl;
		div=d;
		admdate=admD;
		address=addr;
				
	}
	
	Studentadm(String n, String cl, String d,String admD, String addr,String mail, long no )
	{
		name=n;
		cls=cl;
		div=d;
		admdate=admD;
		address=addr;
		email=mail;
		mNo=no;
				
	}
	
	void admit()
	{
		System.out.println("You are admitted to SPC");
	}
	
	void terminate()
	{
		System.out.println("You have been terminated from SPC");
	}
	void changeDiv(String division)
	{
		div=division;
		System.out.println("Your changed division is" +division);
	}
	
	void changeAdd(String addrs)
	{
		address= addrs;
		System.out.println("You changed address is" +addrs);
	}
	
	void changeMob(long No)
	{
		mNo=No;
		System.out.println("Your changed number is" +No);
	}
	
	void changeEMail(String EM)
	{
		email=EM;
		System.out.println("Your changed email is " +EM);
	}
	
	void show()
	{
		System.out.println("The name of student is " +name);
		System.out.println("Class is " +cls);
		System.out.println("Division is " +div);
		System.out.println("Date of admission is " +admdate);
		System.out.println("Address is " +address);
		System.out.println("Email id is " +email);
		System.out.println("Mobile number is " +mNo);		
	}
	

}