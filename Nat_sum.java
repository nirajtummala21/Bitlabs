
import java.util.Scanner;

class Nat_sum{
 public static void main(String args[]){
  Scanner s= new Scanner(System.in);
  int num=s.nextInt();
  int sum=0;
  for(int i=0;i<=num;i++)
   sum +=i;
  System.out.println(+sum);
 }
}
