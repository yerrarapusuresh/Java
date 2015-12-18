 class TestForGeneric<A , B>
{
	A aa ;
	B bb ;
	public TestForGeneric(A a , B b)
	{
		aa = a ;
		bb = b ;
	}
	public A addition()
	{
		return aa + (A) bb ;
	}
}

public class first{
	public static void main(String args[])
	{
		TestForGeneric <String ,String> obj1 = new TestForGeneric<String,String> ("Suresh","Swetha");
		TestForGeneric <Double ,Double> obj2 = new TestForGeneric<Double,Double> (12.222,12.222);
		System.out.println("output of first object "+obj1.addition());
		System.out.println("output of second object "+obj2.addition());
	}
}