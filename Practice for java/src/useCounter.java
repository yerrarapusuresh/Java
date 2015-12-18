import acm.program.* ;
public class useCounter extends ConsoleProgram
{
	public void run()
	{

		Incrementer inc1 = new Incrementer();
		Incrementer inc2 = new Incrementer(1000);
		
		println("Increment first object five times !");
		countFiveTimes(inc1);
		
		println("Increment second object five times");
		countFiveTimes(inc2);
		
		println("Increment first object second time fivetimes");
		countFiveTimes(inc1);
		
	}
	private void countFiveTimes(Incrementer inc)
	{
		int i = 0 ;
		for(i = 0 ; i < 5 ; i++)
		{
			println(inc.getInc());
		}
		
	}
	

}
