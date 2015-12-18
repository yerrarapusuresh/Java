import java.util.* ;

public class ComparatorTest
{
	public static void main(String [] args)
	{
		ArrayList  s = new ArrayList();
		s.add( new StudentWithComparative(3,"suresh",'A'));
		s.add( new StudentWithComparative(4,"susmitha",'B'));
		s.add ( new StudentWithComparative(1,"sunil",'C'));
		Collections.sort(s,new StudentCmpForName());
		//for(int i = 0 ; i < s.length ;i++)
		//	System.out.println(s[i]);
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println((StudentWithComparative)i.next());
		}
	}
}