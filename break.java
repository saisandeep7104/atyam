import java.util.Scanner;
class User
   {
     public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int num=sc.nextInt();
      while(true)
      {
         if(num>0 && num<11) {
             System.out.println("Num is: "+num);
             break;
      	 }
         else
         {
             System.out.println("enter a number");
             num=sc.nextInt();
         }
    }
  }
}
  
      
