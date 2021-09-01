/**
 * 
 */
package modifi;
import defaultAcc.UsingDefault;
import protectAcc.UsingProtect;
import privateAcc.UsingPrivate;
import publicAcc.UsingPublic;

/**
 * @author Vaishnavi
 *
 */

public class JPR28 extends UsingProtect {

	/**
	 * @param args
	 */
	void callSuperMeth()
	{
		// we can access protected modifier of protected class using only inheritance 
		super.a=43;  // calling protected class fields using super keyword
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating an object of UsingDefault class
		UsingDefault ob1 = new UsingDefault();
		
		
		// creating an object of UsingProtect class
		UsingProtect ob2 = new UsingProtect();
		int a = 54; // protected is accessible 
		
		// creating an object of UsingPrivate class
		UsingPrivate ob3 = new UsingPrivate();
		// private is not accessible outside the package without the use of super keyword
		
		//creating an object of UsingPublic class
		UsingPublic ob4 = new UsingPublic();
		ob4.meth4();
		// Public fields and methods are accessible in any package or in any class 
		
		
	}

}

/* Output :
 *  We are using public modifier 
 *  The addition is 77
 *  
 *  Conclusion:
 *  public is accessible in any package or in any class
 *  private is accessible only inside that class
 *  default is accessible within same class and same package
 *  protected is accessible within the same class, same package , and the subclass of outside of package

 * */
