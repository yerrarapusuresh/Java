public class SingleLinkedListTest
{
	public static void main(String [] args)
	{
		SingleLinkedList<Integer> s = new SingleLinkedList<Integer>();
		s.addLast(0);
		s.addLast(1);
		s.addLast(2);
		s.addFirst(-1);
		s.Traverse();

		System.out.println("len: "+s.getLength());
	}
}