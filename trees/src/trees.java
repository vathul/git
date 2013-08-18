class trees{
	int value;
	trees left,right;
	trees(int val)
	{
		value = val;
		left = right=null;
	}
	void insert(int val)
	{
		if(val<value)
			if(left!=null)
			left.insert(val);
			else
				left = new trees(val);
		else
			if(right!=null)
			right.insert(val);
			else
				right = new trees(val);
	}
	void inorder()
	{
		if(left!=null)
			left.inorder();
		System.out.println(value);
		if(right!=null)
			right.inorder();
	}
	int heightOfTree()
	{
		int l=0,r=0;	
		if(left!=null)
		l = left.heightOfTree();
		if(right!=null)
		r = right.heightOfTree();
	return (l>r)? l+1 : r+1;
	}
	void mirror()
	{
		trees temp = left;
		left = right;
		right = temp;
		if(left!=null)
		left.mirror();
		if(right!=null)
		right.mirror();
	}
	
	public static void main(String args[])
	{
		trees t = new trees(8);
		System.out.println("\nInorder:");
		t.insert(5);
		t.insert(7);
		t.insert(6);
		t.inorder();
		System.out.println("\nHeight is:"+t.heightOfTree());
		t.mirror();
		t.inorder();
	}
}