import java.util.ArrayList;
import java.util.Iterator;

 class shape
{	//Some random variable to check how casting works
	 int k = 100;
	 float getArea(){
		 return 0;
	 }
}
class circle extends shape
{
	int k = 1000;
	int radius;
	circle(int r)
	{
		radius = r;
	}
	float getArea()
	{
		return radius*radius*3.14f;
	}
	
}
class square extends shape
{
	int side;
	square(int s)
	{
		side = s;
	}
	float getArea()
	{
		return side*side;
	}
	
}
public class casting{
	public static void main(String args[])
	{
		ArrayList<shape> s = new ArrayList<shape>();
		//Everything upcasted to shape
		s.add(new circle(5));
		s.add(new square(5));
		System.out.println(s.get(0).getArea());
		System.out.println(s.get(1).getArea());
		//Now capture only the circles and print them
		Iterator<shape> i = s.iterator();
		while(i.hasNext()){
			shape x = i.next();
			if(x instanceof circle)
			{
				
			System.out.println( ((circle)x).getArea());
			//IMPORTANT: Variables are bound to the parent class and have to be downcasted
			System.out.println(((circle)x).k);
			}
		}
	}
}