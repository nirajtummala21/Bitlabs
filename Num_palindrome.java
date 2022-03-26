
import java.util.Scanner;

class Num_palindrome{
 public static void main(String args[]){
 Scanner s=new Scanner(System.in);
 int num=s.nextInt();
 int reversedNum=0;
 int remainder;

 int originalNum=num;

 while(num!=0){
  remainder =num%10;
  reversedNum=reversedNum*10+remainder;
  num /=10;
 }

 if(originalNum ==reversedNum)
  System.out.println(originalNum +" is a Palindrome. ");

 else
  System.out.println(originalNum+" is not a Palindrome");
 }
}

