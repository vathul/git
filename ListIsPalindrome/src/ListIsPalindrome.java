//Check if  a list is a palindrome or not. Each node in a list has a character
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
public class ListIsPalindrome{
	static boolean checkPalindrome(LinkedList<Character> l)
	{
		Stack<Character> s = new Stack<Character>();
		Iterator<Character> i = l.iterator();
		while(i.hasNext())
		{
			s.push(i.next());
		}
		i=l.iterator();
		while(!s.empty())
		{
			if(s.pop()==i.next())
				continue;
			else
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		LinkedList<Character> c = new LinkedList<Character>();
		c.add('m');
		c.add('o');
		c.add('d');
		System.out.println(ListIsPalindrome.checkPalindrome(c));
	}
}