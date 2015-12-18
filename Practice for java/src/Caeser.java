import java.util.*;
public class Caeser {

	public static void main(String[] args) 
	{
		//String str = "suresh is good boy";
		String n = Encrypt("ABCD");
		System.out.println(n);
		
		
		
		

	}
	
	public static String Encrypt(String toEnp)
	{	
		String str = "";
		
		for(int i = 0 ;i < toEnp.length();i++)
		{
			char ch = toEnp.charAt(i);
			if(check(ch))
			{
				if(ch >='A' && ch<='Z' )
					str = str+(char)(((((ch)%'A')+3)%26)+'A');
					
			}
				
		}
		
		return str;
	}
	
	public static  boolean check(char ch)
	{
		if((ch<= 'Z' && ch>='A') || (ch>='A' && ch <= 'z'))
			return true ;
		
		return false ;
	}

}












