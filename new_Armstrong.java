
import java.util.*;

class new_Armstrong{
 public static void main(String args[]){
   int count =0,sum=0;
   int n,a,b,c;

   Scanner s=new Scanner(System.in);
   int f=s.nextInt();

  // System.out.print("Armstrong numbers from 1 to 1000:");

   for(int i=1;i<=f;i++)
   {
    n=i;
    while(n>0)
    {
     b=n%10;
     sum=sum+(b*b*b);
     n=n/10;
    }
    if(sum==i)
    {
      System.out.print(i+" ");
    }
    sum=0;
   }
  }
}
