Class Sample
{
public static void main(String[]args)
{
 Demo t1=new Demo();
 t1.setName("sumanth");
 Demo t2=new Demo();
 t2.setName("sai");
 Demo t3=new Demo();
 t3.setName("Rakesh");
 Demo t4=new Demo();
 t4.setName("kumar");
t1.start();
t2.start();
t3.start();
t4.start();
}
}
class Demo extends Thread
{
 @Override
 public void run()
{
 for(int x=0;x<=20;x++)
 {
  System.out.println("Thread.currentthread.getName()+""+x);
 }
}
}