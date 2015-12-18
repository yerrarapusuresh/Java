public class  SingleLinkedList<T>
{
	private class  Node <T>
	{
		T item ;
		Node<T> next ;

		public Node(T item, Node<T> next)
		{
			this.item = item ;
			this.next = next ;
		}

		public T getItem()
		{
			return item ;
		}
		public Node<T> getNext()
		{
			return next ;
		}
		public void setNext(Node<T> n)
		{
			 next = n ;
		}

	}

	private Node<T> head = null ;
	private int length = 0 ;
	private Node<T> tail = null ;

	public int getLength()
	{
	 return length; 
	}

	public void addFirst(T item ) 
	{
		head = new Node<>(item , head);
		if(length == 0)
			tail = head ;
		length++ ;
	}
	public void addLast(T item )
	{
		if(isEmpty())
			addFirst(item);
		else
		{
			tail.setNext(new Node<>(item ,null));
			tail = tail.getNext();
			length++; 

		}
	}
	public boolean isEmpty()
	{
		return head == null ;
	}
	public T first()
	{
		if(!isEmpty())
			return head.getItem();
		return null ;
	}


	public void Traverse()
	{
		Node <T> temp = head ;
		while(temp != null )
		{
			System.out.println(""+temp.item);
			temp = temp.next ;
		}
	}
}