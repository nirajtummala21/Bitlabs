
import java.util.Scanner;

class Sum_digits{
 public static void main(String args[]){
  int num,digit,sum=0;
  Scanner s=new Scanner(System.in);
  num=s.nextInt();

  while(num>0)
  {
    digit=num%10;
    sum=sum+digit;
    num=num/10;
  }
 System.out.println(+sum);
 }
} 

