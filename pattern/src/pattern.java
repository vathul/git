import java.util.ArrayList;
public class pattern{
	public static void main(String args[])
	{
		String pattern = "vat";
		String text = " the greatest human on earth is vat";
		text = text.trim();
		int i = pattern.hashCode();
		int j = "vat".hashCode();
		ArrayList<Integer> indexOfPattern= new ArrayList<Integer>();
		int patternLength = pattern.length();
		int count=0;
		StringBuffer temp =new StringBuffer("");
		for(int k=0;k<text.length();k++)
		{
			if((k>0)&&(count%patternLength == 0))
				{	
				temp.append(text.charAt(k));
				System.out.println(i+" "+temp.toString().hashCode()+" "+temp);
				if(i == temp.toString().hashCode())
				{		
					indexOfPattern.add(k-patternLength);
				}
				temp=new StringBuffer("");				
				}
			else
				temp.append(text.charAt(k));
			count++;
		}
		for(i=0;i<indexOfPattern.size();i++)
		{
			System.out.println(indexOfPattern.get(i));
		}
	}
	
}