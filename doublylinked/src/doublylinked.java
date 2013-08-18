public class doublylinked<T>{
	T value;
	doublylinked<T> forward,backward;
	doublylinked(T val)
	{
		value = val;
		forward = null;
		backward=null;
	}
	doublylinked<T> insertAtBack(T val)
	{	
		doublylinked<T> h = this;
		while(h.forward!=null)
			h = h.forward;
		h.forward = new doublylinked<T>(val);
		h.forward.backward = h;
		return h.forward;
	}
	void display()
	{
		doublylinked<T> h = this;
		while(h!=null)
			{
			System.out.println(h.value);
			h=h.forward;			
			}
	}
	public static void main(String args[])
	{
		doublylinked<Integer> t = new doublylinked<Integer>(10);
		doublylinked<Integer> tail = t.insertAtBack(20);
		System.out.println("\nSecond last from tail:"+tail.backward.value);
		
		t.display();
	}
}