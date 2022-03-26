
import java.util.Scanner;

class Print_num{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);

  boolean flag=true;
  int num=s.nextInt();
  int i=0;
  while(flag)
  {System.out.println(+i);
   i++;
   num--;
   if(num==1)
    flag=false;
  }
 }
}
