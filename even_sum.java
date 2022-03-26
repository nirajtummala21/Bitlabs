
import java.util.Scanner;

class even_sum{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();
  boolean flag=true;
  int i=0;
  int sum=0;
  while(flag)
  {
   if(i%2==0)
    sum +=i;
   ++i;
   if(i>num)
    flag=false;
  }
  System.out.println(+sum);
 }
}
