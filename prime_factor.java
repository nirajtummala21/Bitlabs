// Niraj tummala -Apr 5,2022:

import java.util.*;

class prime_factor{
 public static void main(String args[]){   
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
// int count=0;
 int i=0;
 for(i=2;i<=n;i++)
  { 
    while(n%i==0){
     System.out.println(i+" ");
     n=n/i;     
     }
  } 
 if(n>2)
  System.out.println(n);
 } 
}
