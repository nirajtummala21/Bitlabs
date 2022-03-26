
import java.util.Scanner;

class Positive_Negative{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();

  if(num>0)
    System.out.println("number greater than zero");
  else if(num<0)
    System.out.println("number less than zero");
  else if(num==0)
    System.out.println("number is equal to zero");
 }
} 

 
