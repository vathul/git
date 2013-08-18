public class binarySearch{
	static int binarysearch(int array[],int low,int high,int val)
	{
		int ret;
		if(low==high)
			return -1;
		int middle = (low+high)/2;
		if(val==array[middle])
			return middle;
		if(val<array[middle])
			ret= binarysearch(array,low,middle,val);
		else
			ret = binarysearch(array,middle+1,high,val);
		return ret;
	}
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50,60};
		System.out.println(binarysearch(a, 0, a.length-1, 10));
	}
}