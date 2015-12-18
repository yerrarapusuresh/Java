
public class Palindrome 
{
	public static void main(String args[])
	{	
		int  i=0,j = 0 ;
		String str = new String("surus ");
		j = str.length()-1;
		
		for(i=0 ;i<j;i++,j--)
		{
			if(str.charAt(i) == str.charAt(j));
			
			else
				System.out.println("this is not palindrome");
				
				
		}
		System.out.println(str);
	}

}
