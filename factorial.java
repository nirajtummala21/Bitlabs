
import java.util.*;

class factorial{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int product=1;
  for(int i=0;i<=a;i++)
  {
    product=product*i;	  
  }	  
  System.out.println("%d"+product);
 }
}


