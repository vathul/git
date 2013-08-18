import java.util.Arrays;

public class quicksort{
	static void quickSort(int[] array,int left,int right)
	{
		int index = partition(array,left,right);
		if(left<index-1)		
		quickSort(array,left,index-1);
		if(right>index)		
		quickSort(array,index,right);
	}
	static int partition(int[] array, int left,int right)
	{
		int pivot = array[(left+right)/2];
		while(left<=right){
		while(array[left]<pivot)
			left++;
		while(array[right]>pivot)
			right --;
		if(left<=right)
		{
			int temp = array[left];
			array[left]=array[right];
			array[right]=temp;
			right--;
			left++;
		}}
		return left;
	}
	public static void main(String args[])
	{
		int[] array={0,4,9,2,5,3,1};
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
}