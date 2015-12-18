import acm.program.*;

public class Addition extends ConsoleProgram{

	public void run ()
	{
			println("This program add's two intiges");
			int n1 = readInt("Enter n1");
			int n2 = readInt("Enter n2");
			int total = n1 + n2 ;
			println("The total is "+total+".");
		
	}
}
