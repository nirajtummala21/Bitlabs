
import java.util.*;

class sum_prime{
 public static void main(String args[]){

 Scanner s=new Scanner(System.in);
 int n=s.nextInt(); 
 int count=0;
 int i,sum=0;
 for(i=2;i<=n;i++)
  { 
    for(int j=2;j<=i;j++)
    { 
      if(i%j==0)
	count++;
    }
    if(count==1)
     sum+=i;  
    count=0;    
  }
 System.out.println(+sum);
 }
}

