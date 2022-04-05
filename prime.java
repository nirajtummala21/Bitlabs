
import java.util.*;

class prime{
 public static void main(String args[]){
  
 Scanner s=new Scanner(System.in);
 
 int num=s.nextInt();

 int count=0;

 for(int i=2;i<num;i++)  
 {
   if(num%i==0)
    { 
         count++;  	       
    }       
  }

 if(count!=0) 
  System.out.println("has "+count+" factors and is not a prime");

 else
  System.out.println("is a prime");
 }
}

