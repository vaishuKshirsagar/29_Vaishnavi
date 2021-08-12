package com.google;

public class JPR6 {

    String s;
    static{
        System.out.println("Static block Executed at first");
    }
    {
        System.out.println("Instance block executed after object of class is created");
        System.out.println("Instance varibles initialised here");
        s="Vaishnavi";
    }
    static{
        System.out.println("Second static block");
        
    }
	public static void main(String[] args) {
		
		 System.out.println("Object of class created");
	        JPR6 ob=new JPR6();
	        System.out.println("Value of initialized variables in instance block");
	        System.out.println(" s= "+ob.s);


	}

}
