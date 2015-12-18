public class TestMergeSort
{
	public static void main(String[] args)
	{
		String[] a = {"Suresh","Yerrarapu","Abc","abc","suno"};
		MergeSort.sort(a);

		for(int i = 0 ; i < a.length ; i++)
			System.out.println(a[i]);
	}
}