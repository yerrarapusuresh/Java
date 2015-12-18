import javax.swing.* ;

public class TestInsertionSort
{
	public static void main(String[] args)
	{
		int i  ;
		String[] in = new String[5] ;
		for( i = 0 ; i < 5 ; i++)
			in[i] = new String(JOptionPane.showInputDialog("Please enter input number "));
		//InsertionSort s = new InsertionSort(in);
		InsertionSort.sort(in);
		for(i = 0 ; i < in.length ; i++)
			System.out.println(in[i]);
	}
}