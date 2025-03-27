class All
{
	public static void main(String[]args)
	{
	Runnable r=()->
	{
             for(int x=0;x<10;x++)
               {
		try
		{
 		Thread.currentThread().sleep(1000);
 		System.out.println(Thread.currentThread().getName());
		}catch(InterruptedException e)
		{
 		System.out.println("THREAD IS INTERRUPTED FROM SLEEP");
		}
          }
	
	};
	for(int x=0;x<20;x++)
	{
 	System.out.println(Thread.currentThread().getName());
 	}
 	Thread t1=new Thread(r,"T1");
 	t1.start();
 	Thread t2=new Thread(r,"T2");
 	t2.start();
}
}
