//Partition a linked list such that elements lesser than x are before x and
//elements greater than x are after it.
import java.util.LinkedList;
public class partitionLinkedList{
	LinkedList<Integer> partition(LinkedList<Integer> l , int x)
	{
		l.addFirst(x);
		for(int i =0; i<l.size();i++)
		{
			if(l.get(i)<x)
			{
				
				l.addFirst(l.remove(i));
			}
		}
		return l;
	}
	public static void main(String args[])
	{
		partitionLinkedList obj = new partitionLinkedList();
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(20);
		l.add(33);
		l.add(24);
		l.add(35);
		l.add(60);
		System.out.println(obj.partition(l, 34).toString());
	}
	
}