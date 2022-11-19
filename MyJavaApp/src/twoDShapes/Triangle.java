package twoDShapes;

public class Triangle extends Closed2DShapes{

private double side1;
private double side2;
private double side3;	

Triangle(double side_a, double side_b, double side_c)
{
	side1=side_b;
	side2=side_b;
	side3=side_c;
}

public void surfaceArea()
	{
	double area=0;
	double s= (side1+side2+side3)/2;
	area= s*(s-side1)*(s-side2)*(s-side3);
	System.out.println("Surface Area is: "+ area);	
	}	
public void perimeter()
	{
	double peri=0;
	peri = side1+side2+side3;
	System.out.println("Perimeter is: "+ peri);		
	}
}