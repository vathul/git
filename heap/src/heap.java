public class heap{
	int heap[] = new int[100];
	int last;
	void buildHeap(int i)
	{
		
	}
	int[] heapify(int heap[])
	{	int end = 0;
		int temp []= new int[heap.length];
		for(int i=0;i<heap.length-1;i++)
		{
			temp[end]=heap[i];
			end++;
			int counter = end;
			int child = (counter/2);
			while(child>0)
			{
				if(temp[child]>temp[counter]){
					temp[child] += temp[counter];
					temp[counter]= temp[child]- temp[counter];
					temp[child]-= temp[counter];
				}
				counter = child;
				child = (counter/2);
			}
		}
		for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
		return null;
	}
	void display()
	{
		int arr[] = {1,4,3,6,7,2,9,22,9,8,12};
		heapify(arr);
	}
	public static void main(String args[])
	{
		heap h = new heap();
		h.display();
	}
}