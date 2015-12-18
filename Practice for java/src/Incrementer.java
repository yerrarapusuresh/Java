
class Incrementer 
{
	public Incrementer(int counter)
	{
		this.counter = counter ;
	}
	
	public Incrementer ()
	{
		counter = 1 ;
	}
	
	
	public int getInc()
	{	
		int temp = counter ;
		counter ++ ;
		return temp;
		
	}
	private static int  counter ;

	
	
	
	
}
