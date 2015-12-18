import java.lang.* ;
public class InsertionSort
{
	public static void sort(Comparable [] array)
	{
		int j , i ;
		Comparable key ;
		for( j = 1 ; j < array.length ; j++)
		{
			i = j -1 ;
			key = array[j];
			while(i >= 0 && key.compareTo(array[i]) < 0)
			{
				array[i+1] = array[i] ;
				i-- ;
			}
			array[i+1] = key ;
		}
	}
}