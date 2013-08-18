public class stack<T>{
	public class element{
		T val;
		element next;
		element(T value)
		{
			val = value;
			next = null;
		}
	}
	element top=null;
	stack(T val)
	{
		if(top==null)
		{
			top = new element(val);
		}
		
	}
	void push(T val)
	{
			element temp = new element(val);
			temp.next = top;
			top = temp;		
	}
	T pop()
	{
		if(top == null)
			return null;
		else
		{
			T temp = top.val;
			top = top.next;
			return temp;
		}
	}
	public static void main(String args[])
	{
		stack<Integer> s = new stack<Integer>(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
	}
}