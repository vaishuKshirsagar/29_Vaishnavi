/*In a small company, the average salary of three employees is Rs1000 per week. If one employee
 * earns Rs1100 and other earns Rs500, how much will the third employee earn? Solve by using java programm
 */

package com.Itrassignment;

public class TestAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int E1=1100;
		int E2=500;
		float E3;
		
		//AvgSal=(E1+E2+E3)/3
		//1000=(1100+500+E3)/3
		//1000*3=1100+500+E3
		
		int AvgSal=1000*3;
		int sum =E1+E2;
	    E3=AvgSal-sum;
		System.out.println("The salary of third employee will be Rs" +E3);
		
	}

}
