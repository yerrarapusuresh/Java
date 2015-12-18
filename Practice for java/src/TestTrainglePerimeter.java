
public class TestTrainglePerimeter 
{
	public static void main(String args[])
	{
		TrainglePerimeter t1 = new TrainglePerimeter(1,2,3);
		TrainglePerimeter t2 = new TrainglePerimeter();
		TrainglePerimeter t3 = new TrainglePerimeter(3);
		
		t2.setSides(2.0, 3.3234, 3.456);
		System.out.println(t1.getPerimeter());
		System.out.println(t2.getPerimeter());
		System.out.println(t3.getPerimeter());
		
		
		

	}

}
