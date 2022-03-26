
import java.util.Scanner;

class digits{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int num,count=0;
  num=s.nextInt();

  while(num>0)
   {
    num=num/10;
    count=count+1;
   }
  System.out.println(+count);
 }
}

