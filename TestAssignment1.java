/*Reverse a String and print it on console
   "Java Skills" .
*/
package com.Itrassignment;

public class TestAssignment1 {

	 public static void main(String[] args) 
	    {
	        String s="Java Skills";
	        
	        String rev="";
	        for(int i=s.length()-1;i>=0;i--)
	        {
	            rev=rev+(s.charAt(i));
	        }
	        System.out.println(rev);
	}
}
