
import java.util.Scanner;

class first_lastdig{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();
  int k=num;
  boolean flag =true;
  while(flag)
  {
   k=k/10;
   if(k<10)
    flag =false;
  }
  num=num%=10;
  System.out.println(+k);
  System.out.println(+num);
 }
}
