
public class Tree<E extends Comparable<E>>
{

	private Node root;

	public class Node
	{
		private E key ;
		private Node right, left;
		public Node(E key, Node right, Node left)
		{
			this.key = key;
			this.right = right;
			this.left = left;
		}

	}
	public void insert(E key)
	{
		root = insert(root, key);
	}
	private Node insert(Node root, E key)
	{
		if(root == null)
			return new Node(key, null, null);
		int temp = key.compareTo(root.key);

		if(temp < 0)
			root.left = insert(root.left, key);
		else if(temp > 0)
			root.right = insert(root.right, key);
		else 
			root.key = key;
		return root;
	}
	public void inorder()
	{
		inorder(root);
	}
	private void inorder(Node root)
	{
		if(root == null)
			return ;
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
	}

	public static void main(String args[])
	{
		Tree<Integer> t = new Tree<Integer>();
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(4);
		t.insert(-1);
		t.inorder();
	}

}