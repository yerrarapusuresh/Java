public class AboutStatic
{
	public static void main(String args[])
	{
		abtStatic c = new abtStatic();
		System.out.println("Check\n");
	}
}


class abtStatic extends sample
{
	private static int num = 0 ;
	static
	{
		System.out.println("Checking about static block");
	}
	public abtStatic()
	{
		System.out.println("constructore");
	}
}
class sample
{
	int i = 0 ;
	static 
	{
		System.out.println("it might be first");
	}
	public sample()
	{
		System.out.println("its second");
	}
}