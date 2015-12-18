
public class useOfStatic 
{

	
	
	useOfStatic()
	{
		num = 0;
	}
	
	public int nextNUM()
	{
		int temp = num ;
		num++;
		return temp ;
		
	}
	
	private static int num = 0 ;
}
