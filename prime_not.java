
import java.util.*;

class prime_not{
 public static void main(String args[]){
  
  Scanner s= new Scanner(System.in);
  int n=s.nextInt();
  int count=0;
  int i,j;
  for(i=2;i<=n;i++)
   {
    // System.out.println("in outer loop");	   
     for(j=2;j<=i;j++)
     {	     
       if(i%j==0)
         count++;
      // System.out.println("in inner loop");
     }
      if(count==1) 
       System.out.println(+i+"is a prime");  
    count=0;   
   }
 }
}

