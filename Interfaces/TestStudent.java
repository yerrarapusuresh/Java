import java.util.* ;

public class TestStudent 
{
	public static void main(String[] args)
	{
		//Student[] s = new Student[3];
		List  s = new ArrayList();
		s.add( new Student(3,"suresh",'A'));
		s.add( new Student(4,"susmitha",'B'));
		s.add ( new Student(1,"sunil",'C'));
		Collections.sort(s);
		//for(int i = 0 ; i < s.length ;i++)
		//	System.out.println(s[i]);
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println((Student)i.next());
		}

	}
}