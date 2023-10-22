package Pertemuan8.Kasus2;

public class Rectangle extends Shape {
	private double width;
	private double length;

	//--------------------------------------
	//  Constructor: Sets up the rectangle.
	//--------------------------------------
	public Rectangle(double r, double e)
	{
		super("Rectangle");
		width = r;
		length = e;
	}
	
	//--------------------------------------
	//  Return the surface area of the sphere.
	//--------------------------------------
    @Override
	public double area() 
	{
		double area = width * length; 
		return area;
	}
	
	//--------------------------------------
	//  Return the surface area of the sphere.
	//--------------------------------------
    @Override
	public String toString()
	{
		return super.toString() + " width: " + width + " and length: " + length;
	}
}