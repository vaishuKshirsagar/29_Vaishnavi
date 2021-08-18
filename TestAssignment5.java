/*A train 340 m long is running at a speed of 45 km/hr.
what time will it take to cross a 160 m long tunnel?*/
package com.Itrassignment;

public class TestAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ltrain= 340;
		double speed = 45;
		int ltunnel= 160;
		
		/* Here first we convert 45Km/hr into m/sec i.e 45*1000/3600
		 * 45000/3600 
		 * speed=25/2 m/s
	     */
		
		speed=(double) speed*(1000/3600.0);
        int distance=ltunnel+ ltrain;
        double time=distance/speed;
        
        System.out.println("The time required to cross tunnel will be "+time+"Sec");
        

	}
	

}
