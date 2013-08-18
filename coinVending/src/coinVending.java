public class coinVending{
	static boolean give(int coins[],int value,int index)
	{	boolean ret=true;
		boolean giveCoin=false;
	
		if(value ==0)
			return true;
		
		if(index > coins.length-1)
			return false;
	
		
		if(value>=coins[index])
			{value = value - coins[index];
			giveCoin=true;
			}
		if(value>=coins[index])
		ret = give(coins,value,index);
		else
		ret = give(coins,value,index+1);
		
		if(ret == false)
			{value = value + coins[index];
			giveCoin=false;
			ret = give(coins,value,index+1);			
			}
		 if(ret == true)
		{
			if(giveCoin==true)
			System.out.println(coins[index]);
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		int coins[]={5,2,1};
		coinVending.give(coins, 13 , 0);
	}
}