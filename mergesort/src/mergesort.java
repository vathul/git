import java.util.Arrays;

public class mergesort{
	int i;
	static int[] merge(int[]first, int[]second)
	{
		int temp[] = new int[first.length+second.length];
		int firstIndex=0;
		int secondIndex=0;
		int tempIndex=0;
		while(firstIndex<first.length && secondIndex<second.length)
		{
			if(first[firstIndex]<second[secondIndex])
			{
				temp[tempIndex++]=first[firstIndex++];
			}
			else
			{
				temp[tempIndex++]=second[secondIndex++];
			}
		}
		while(firstIndex<=first.length-1)
		{
			temp[tempIndex++]=first[firstIndex++];
		}
		while(secondIndex<=second.length-1)
		{
			temp[tempIndex++]=second[secondIndex++];
		}
		return temp;
	}
	
	public static int[] mergeSort(int[] unsorted) {
		// base case
		if(unsorted.length == 1) return unsorted;
		
		// create two arrays and divide unsorted array into the two
		int[] left = new int[unsorted.length/2];
		System.arraycopy(unsorted, 0, left, 0, unsorted.length/2);
		
		int[] right = new int[unsorted.length-left.length];
		System.arraycopy(unsorted, left.length, right, 0, right.length);
		
		// recursive calls first
		// call itself to sort the left and right halves
		left = mergeSort(left);		
		right = mergeSort(right);
		
		// then merge them to create the sorted array
		return merge(left, right);
		
	}
	public static void main(String args[])
	{	
	
		
		int a[] = {3,6,4,1,8,9,0,11};
		System.out.println(Arrays.toString(mergeSort(a)));
	}
}