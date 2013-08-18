import java.util.Arrays;

public class bubble{
	static int[] bubblesort(int[] unsorted)
	{
		boolean swap = false;
		int length = unsorted.length;
		for(int i =length-1;i>0;i--)
		{	swap = false;
			for(int j=0;j<i;j++)
			{
				if(unsorted[j]<unsorted[j+1])
				{
					int temp = unsorted[j];
					unsorted[j]=unsorted[j+1];
					unsorted[j+1]=temp;
					swap=true;
				}						
			}
			if(swap == false)
				break;
		
		}			
		return unsorted;
	}
	public static void main(String args[])
	{
		int a[]={1,5,3,2,9,6};
		bubblesort(a);
		System.out.println(Arrays.toString(bubblesort(a)));
	}
}