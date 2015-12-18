import java.lang.* ;
public class MergeSort
{
	
	private static Comparable[] aux ;
	private  static void sort(Comparable[] array,Comparable[] aux, int low , int high)
	{
		if(low < high)
		{
			int mid = (low + high)/2 ;
			sort( array , aux,low , mid );
			sort(array,aux, mid+1 , high);
			merge(array,aux, low , mid , high);
		}
	}

	public static void sort(Comparable [] array)
	{
		 aux = new Comparable[array.length];
		sort(array,aux,0,array.length-1);
	}


	private static void merge(Comparable[] array ,Comparable[] aux, int low , int mid , int high )
	{
		for(int i = low ; i <= high ; i++)
			aux[i] = array[i];
		int i = low , j = mid + 1 ; 
		for(int k =  low ; k <= high ; k++)
		{
			if( i > mid)
				array[k] = aux[j++] ;
			else if (j > high)
				array[k] = aux[i++];
			else if(aux[j].compareTo(aux[i]) < 0 )
				array[k] = aux[j++];
			else
				array[k] = aux[i++];
		}
	}
}