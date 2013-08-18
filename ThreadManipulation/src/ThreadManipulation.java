import javax.swing.plaf.SliderUI;

//Two threads should increment the same number alternately.
public class ThreadManipulation{
	int i=0;
	boolean lock = false;
	 synchronized void increment()
	{
		++i;
	}
	 void display()
	 {
		 System.out.println(i);
	 }
	 int getValue()
	 {
		 return i;
	 }
	public static void main(String args[])
	{
		final ThreadManipulation t = new ThreadManipulation();
		Runnable t1 = new Runnable()
		{
			public synchronized void run()
			{
				while(t.getValue()!=10)
				{
				try {
					synchronized (t) {
					if(t.lock == false)
						{
						t.increment();
						System.out.println("Thread 1:");
						t.display();
						t.lock = true;
						t.notifyAll();
						}
					if(t.lock==true)
					t.wait();}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
			
		};
		Runnable t2 = new Runnable(){
			public synchronized void run()
			{
				while(t.getValue()!=10){
								
				try {
					synchronized (t) {
						if(t.lock==false)
						{
							t.wait();
						}
						if(t.lock==true)
						{t.increment();
						System.out.println("Thread 2:");
						t.display();
							t.lock=false;
							t.notifyAll();
						}
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			}
		};
		t1.run();
		t2.run();
		
	}
}