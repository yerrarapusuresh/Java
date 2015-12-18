
public class echo {


	
		public static void main(String args[])
		{
			for(int i = 0 ;i < args.length;i++)
				System.out.println(""+args[i]);
			System.out.println();
			
			
			int[] a = new int[5];
			
			arrayInitial aa = new arrayInitial();
			aa.a(a);
			
			for(int i = 0 ; i< a.length;i++)
				System.out.println(a[i]+" ");
			
		
	
}}
