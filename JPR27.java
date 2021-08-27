/**
 * 
 */
package com.google;

/**
 * @author Vaishnavi
 *
 */
public class JPR27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceRobots s1 = new ServiceRobots();
		s1.function();
		s1.types();
		
		HumanoidRobots h1 = new HumanoidRobots();
		h1.function();
		h1.types();

	}

}
 
// first interface
interface I1
{
	void function();
	
}

//Second interface
interface I2
{
	void types();

}

// multiple inheritance achieved with the help of interface
class ServiceRobots implements I1,I2
{
	final String name = "ServiceRobo"; // final variable 
	final int type;
	ServiceRobots()
	{
		type=5;
	}
	
	public final void Show()
	{
		
		System.out.println("First type of Robot is Service robot you can call it "+name);
	
	}
	public void function()
	{
		
		System.out.println("Service robot provides service to human ");
		
	}
	public void types()
	{
		
		System.out.println("The types of Service Robots are\n Domestic robots\n Security robots\n Toy robots ");
		
	}
	
}	
	
	// multilevel inheritance
	
 class HumanoidRobots extends ServiceRobots 
 {
	 // we can't override final variable here
	 // And we can't override final method
	 
	 public void function()
		{
			
			System.out.println("Humanoid robot is based on the idea of AI ");
			
		}
		public void types()
		{
			
			System.out.println("The types of Humanoid Robots are\n Voice Recognition\n Face recognition\n Artificial social intelligence");
			
		}
	 
 }
 
 /* 
  *  Service robot provides service to human 
     The types of Service Robots are
     Domestic robots
     Security robots
     Toy robots 
     Humanoid robot is based on the idea of AI 
     The types of Humanoid Robots are
     Voice Recognition
     Face recognition
     Artificial social intelligence 
 
 */


