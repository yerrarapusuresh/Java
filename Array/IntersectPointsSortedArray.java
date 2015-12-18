public class IntersectPointsSortedArray
{
	public static void intersectPoints(int[] arrayOne, int[] arrayTwo)
	{
		int i = 0, j = 0;

		while (i < arrayOne.length && j < arrayTwo.length)
		{
			if (arrayOne[i] < arrayTwo[j])
			{
			
				i++;
				if(i >= arrayOne.length)
					break;
			}
			if (arrayTwo[j] < arrayOne[i])
			{
				j++;
				if(j >= arrayTwo.length)
					break;
			}
			if (arrayTwo[j] == arrayOne[i])
			{
				if(i == 0 || arrayOne[i] != arrayOne[i-1])
					System.out.println(arrayOne[i]);
				i++;
				j++;
			}

		}

	}
}
