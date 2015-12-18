
public class Sphere {
	
	public Sphere(int radius)
	{
		this.radius = radius ;
	}
	
	public Sphere()
	{
		
	}
	
	public double getRadius()
	{	
		return radius;
		
	}
	
	public void setRadius(int radius )
	{
		this.radius = radius ;
		
	}
	
	public double computeArea()
	{

		return PI * radius * radius ;
	}
	
	public double computePerimeter()
	{
		
		return 2 * PI * radius ;
	}
	
	public boolean isIdentical(Sphere s)
	{
			return this.radius == s.getRadius();
	}
	private double radius ;
	static final double PI = 3.14 ;
}
