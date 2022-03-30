
import java.util.Scanner;

public class reverse {
 public static void main(String args[]){
  
  int d,number,temp,revnum=0;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a number ::");
  number = s.nextInt();
  temp=number;
  while(temp>0) {
    d=temp%10;
    revnum=(revnum*10)+d;
    temp=temp/10;
  }
  System.out.println("Reverse of the given number is:"+revnum);
 }
}

