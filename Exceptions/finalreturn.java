class finalreturn
{
	public static void main(String args[])
	{
		System.out.println(""+sample(2));
	}

	public static int sample(int i)
	{
		try
		{
			if((i/0) == 0 )
				return 1 ;
		}
		catch(Exception e)
		{
			return 2;
		}
		finally
		{
			return 3 ;
		}
	}
}
class sample extends finalreturn 
{
	public static void main(String args[])
	{
		System.out.println( (new sample()).sample(8));
	}

	public static  int sample(int i)
	{
		return super.sample(i);
	}
}