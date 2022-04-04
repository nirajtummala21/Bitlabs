
import java.util.*;

class factors{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   for(int i=0;i<=a;i++)
   {
     if(a%i==0)	     
       System.out.println("Factor=",+i); 
   }
 }
}

