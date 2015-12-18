
public class TrainglePerimeter
{
	double s1,s2,s3;
	
	TrainglePerimeter()
	{}
	
	TrainglePerimeter(double side1,double side2,double side3)
	{
		s1 = side1 ;
		s2 = side2 ;
		s3 = side3 ;
	}
	
	TrainglePerimeter(double val)
	{
		s1 = s2 = s3 = val ;
	}
	
	public void setSides(double side1, double side2, double side3 )
	{
		s1 = side1 ;
		s2 = side2 ;
		s3 = side3 ;
	}
	
	public double getPerimeter()
	{
		return s1+s2+s3;
	}
	

}
