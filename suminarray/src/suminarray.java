import java.util.HashSet;
public class suminarray{
	int find(int sum, int array[])
	{
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i =0 ;i < array.length;i++)
		{
			set.add(array[i]);
		}
		for(int i =0; i< array.length-1;i++)
		{
			if(set.contains(sum-array[i]))
				return 1;
		}
		return 0;
	}
	public static void main(String args[])
	{
		suminarray s = new suminarray();
		int a[]={1,2,3,4,5,6};
		System.out.println(s.find(10,a));
	}
}