
import java.util.Scanner;

class leap{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();
  if(num %4==0){
	if(num%100==0){
	 if(num%400 ==0)
	  System.out.println("leap year");
	 else
          System.out.println("not leap year");
	}
	else
	 System.out.println("leap year");
    }
  else
    System.out.println("not a leap year");
 }
}

