/**
 * 
 */
package com.Itrassignment;
/* Write a program to print the area of Oval,Triangle,Rectangle,Pentagon,Hexagon,Trapezium,& Circle
in this program you must be use all OOP concepts*/
/**
 * @author Vaishnavi
 *
 */
public class TestAssig1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pentagon P= new Pentagon(8,9);
		P.show();
		P.area();
		
		CalcuArea O = new Oval(12,7);
		O.area();
		
		CalcuArea R= new Rectangle(43,18);
		R.area();
		
		CalcuArea T= new Triangle(67,16);
		T.area();
		
		Circle C= new Circle(17.5f);
		C.area();
		
		Hexagon H= new Hexagon(34);
		H.area();
		
		Trapezium Tr= new Trapezium(8,5,6);
		Tr.area();
		
	}

}

// abstraction using abstract class
abstract class CalcuArea
{
	final float pi= 3.14f;
	abstract public void area();

}

class Oval extends CalcuArea
{
	int a, b;
	Oval(int a,int b)
	{
		this.a= a;
		this.b= b;
	}
	
// ----Polymorphism----
	// method overriding
	
	public void area()
	{
		System.out.println("The area of Oval is "+(pi*a*b));
	}
		
}

//----Inheritance concept_ Rectangle-> CalcuArea
class Rectangle extends CalcuArea
{
	int l, b;
	Rectangle(int l, int b)
	{
		this.l = l;
		this.b = b;
		
	}
	
	//overriding method area
	public void area()
	{
		System.out.println("The area of Rectangle is "+(l*b));
	}
	
}

// ----Inheritance concept_ Triangle-> CalcuArea
class Triangle extends CalcuArea
{
	int b,h;
	float area;
	Triangle(int b, int h)
	{
		this.b =b;
		this.h= h;
	}
	
	// overriding method area
	
	public void area()
	{
		System.out.println("The area of Triangle is "+(0.5*b*h));
	}
	
}


//------interface-------

interface CalArea 
{ 
    void show();
}

interface ShapeArea
{
	float pi=3.14f;
	void area();
}

// we achieved the multiple inheritance by using two interfaces 
class Pentagon implements CalArea, ShapeArea
{
	float s; // side of the pentagon
	float a; // apothem of the pentagon
	Pentagon(float s, float a)
	{
		this.s = s;
		this.a = a;
	}
	
	public void show()
	{
		System.out.println("This program shows the area of different shapes using all oops concepts");
	}
	public void area()
	{
		System.out.println("The area of Pentagon is "+((5.0/2.0)*s*a));
	}

}

//----- inheritance---Circle->ShapeArea
class Circle implements ShapeArea
{
	float r;
    Circle(float r)
    {
    	this.r = r;
    }
    
    public void area()
    {
    	System.out.println("The area of Circle is "+(pi*r*r));
    }
}

//----Inheritance concept_Hexagon-> ShapeArea
class Hexagon implements ShapeArea
{
	int side;
	final double rt=(3*Math.sqrt(3))/2;
    Hexagon(int side)
    {
    	this.side = side;
    }
    
    public void area()
    {
    	System.out.println("The area of Hexagon is "+((double)rt*side*side));
    }
}

//----Inheritance concept_ Trapezium-> ShapeArea
class Trapezium implements ShapeArea
{
	int a, b, h;
    Trapezium(int a, int b, int h)
    {
    	this.a = a;
    	this.b = b;
    	this.h = h;
    }
    
    public void area()
    {
    	System.out.println("The area of Trapezium is "+((float)(0.5)*a*b*h));
    }
}

/* --- Output ---
This program shows the area of different shapes using all oops concepts
The area of Pentagon is 180.0
The area of Oval is 263.76
The area of Rectangle is 774
The area of Triangle is 536.0
The area of Circle is 961.625
The area of Hexagon is 3003.3761003244335
The area of Trapezium is 120.0
*/

