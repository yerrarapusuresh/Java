import acm.program.*;
public class Sentinal extends ConsoleProgram
{
	private static final int sen = 0 ;
	public void run()
	{
		int tot = 0 ;
		int val =0;
		
		
		do{
			tot+= val;
			val = readInt("Enter a value");
					
		}while (val != sen);
		println("total = "+tot+".");
		
		
		
	}
}

