public class queue<T>{
	private class queueElement
	{
		T val;
		queueElement next;
		public queueElement(T val) {
			// TODO Auto-generated constructor stub
			this.val = val;
			next = null;
		}
		
	}
	queueElement head=null,tail=null;	
	
	
	queue(T value)
	{
		if(head==null){
			head = new queueElement(value);
			tail=head;}
	}
	
	
	
	void enqueue(T value)
	{
		tail.next =  new queueElement(value);
		tail=tail.next;	
	}
	
	T deque()
	{
		if(head == null)
			return null;
		else{
		T val = head.val;
		head = head.next;
		return val;
		}
	}
	boolean isEmpty()
	{
		if(head == null)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		queue<Integer> q = new queue<Integer>(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println("Queue is empty:"+q.isEmpty());
	}
}