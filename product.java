
import java.util.Scanner;

public class product{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);

  int num,temp;
  int product=1;

  System.out.print("Enter any number :");
  num=s.nextInt();

  temp=num;

  while(temp!=0)
  {
    product=product*(temp%10);
    temp=temp/10;
  }
  System.out.println("Product of all digits in "+product);
 }
}
