package twoDShapes;

public class Rectangle extends Closed2DShapes{
private double length;
private double breadth;
Rectangle(double len, double bre)
	{   
	length= len;
	breadth= bre;  
	}
public void surfaceArea()
	{
	double area=(length * breadth);
	System.out.println("Surface Area is :"+area);
	}
public void perimeter()
	{
	double peri=2* (length + breadth);
	System.out.println("Perimeter is: "+ peri);
	}
}