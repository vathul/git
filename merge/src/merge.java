import java.util.Arrays;

public class merge{
	static int[] Merge(int []a,int[] b)
	{
		int [] temp= new int[a.length+b.length];
		int aIndex = 0;
		int bIndex = 0;
		int tIndex = 0;
		while((aIndex < a.length-1)&&(bIndex<b.length-1))
		{
			if(a[aIndex]<b[bIndex])
				temp[tIndex++] = a[aIndex++];
			else
				temp[tIndex++] = b[bIndex++];
		}
		while(aIndex<a.length)
			temp[tIndex++]=a[aIndex++];
		while(bIndex<b.length)
			temp[tIndex++]=b[bIndex++];
	return temp;	
	}
	static int[] mergeSort(int[] unsorted)
	{
		if(unsorted.length==1)
			return unsorted;
		int left[] = new int[unsorted.length/2];
		int right[] = new int[unsorted.length - left.length];
		int temp[] = new int[unsorted.length];
		System.arraycopy(unsorted, 0, left, 0, unsorted.length/2);
		System.arraycopy(unsorted, left.length, right, 0, right.length);
		left = mergeSort(left);
		right = mergeSort(right);
		return Merge(left,right);
	}
	public static void main(String args[])
	{
		int a[] = {2,3,1,5,9,0,2};
		System.out.println(Arrays.toString(mergeSort(a)));
	}
}