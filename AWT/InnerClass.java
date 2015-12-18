public class InnerClass
{
	private class InsideClass
	{
		private int c = 0 ;
		
	}
	public static void main(String args[])
	{
		InnerClass in = new InnerClass();
	 
		in.go();	
	}
	public void go()
	{
		InsideClass in = new InsideClass();
		in.c = 100 ;
	}
	

}