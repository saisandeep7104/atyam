class armstrong{
    public static void main(String[] args){
    int num=157,rem=0,sum=0,power=0,temp=0;
    while(num>0)
    {
      rem=num%10;
      power=(int) Math.pow(rem,3);
      sum=sum+power;
      num=num/10;
    }
    System.out.println("sum is" +sum);
    System.out.println("num is" +num);
    if(sum==temp)
         System.out.println("armstrong");
    
  }
} 