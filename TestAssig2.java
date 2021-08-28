/**
 * 
 */
package com.Itrassignment;

/**
 * @author Vaishnavi
 *
 */
public class TestAssig2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdCard Id = new IdCard();
		Id.Emp_Id();
	}

}

abstract class Employee 
{
	String name = "Vaishnavi";
	String company_name = "Microsoft";
	String qualification= "Mtech IT";
	String department = "IT";
	String mailId ="vaishu154@gmail.com";
	long phNo = 64687920;
	int IdNo = 8785;
	String address = "Delhi";
	abstract public void Emp_Id();
	
}

class IdCard extends Employee 
{
	public void Emp_Id()
	{
		System.out.println("--------------------------------");
		System.out.println("-----------Id_Card--------------");
		System.out.println("--------------------------------");
		System.out.println("Name: "+name);
		System.out.println("Comapny_Name: "+company_name);
		System.out.println("Qualification: "+qualification);
		System.out.println("Name of Department: "+department);
		System.out.println("Mail id: "+mailId);
		System.out.println("Phone No : "+phNo);
		System.out.println("Id_No: "+IdNo);
		System.out.println("Address: "+address);
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
	
	}
}


/*  Output
--------------------------------
-----------Id_Card--------------
--------------------------------
Name: Vaishnavi
Comapny_Name: Microsoft
Qualification: Mtech IT
Name of Department: IT
Mail id: vaishu154@gmail.com
Phone No : 64687920
Id_No: 8785
Address: Delhi
--------------------------------
--------------------------------
*/
