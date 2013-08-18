import java.util.Arrays;

public class insertion{
	static void Selection(int unsorted[]){
	int length = unsorted.length;
		for(int i=0;i<length;i++)
		{int maxIndex=i;
			for(int j=i;j<length;j++)
			{
				if(unsorted[j]>maxIndex)
					maxIndex = j;
			}
			int temp = unsorted[i];
			unsorted[i]=unsorted[maxIndex];
			unsorted[maxIndex] = temp;
		}
	}
	public static void insertionSort(int[] data) {
		/*
		 * starts imaginary division line at 1 and increase
		 * Invariant : values less than out variable are sorted.
		 */
		for(int out=1; out < data.length; out++) {
			// save the first value in the right hand side of the line as temp
			int temp = data[out]; 
			int in = out;
			
			/*
			 * traverse values in the left hand side backward
			 * and compare values with the temp value
			 * if necessary, shift the values up by one index
			 */
			while(in > 0 && data[in-1] >= temp) {
				data[in] = data[in-1];
				in--;
			}
			
			/*
			 * finally, insert the temp value into the right position
			 * in the left hand side of the line  
			 */
			data[in] = temp;
		}
	}
	static void Insertion(int unsorted[])
	{
		for(int i=1;i<unsorted.length;i++)
		{ 
			int k;
			int j = unsorted[i];
			for(k=i;k>0;k--)
			{
				if(unsorted[k-1]>j)
				{
					unsorted[k] = unsorted[k-1];
				}
				else
					break;				
			}
			unsorted[k] =j;			
		}
	}
	public static void main(String[] args)
	{
		int a[]={2,1,3,9,4,8};
		Insertion(a);
		System.out.println(Arrays.toString(a));
	}
}