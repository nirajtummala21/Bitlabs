
import java.util.Scanner;

class week
{
  public static void main(String args[]){
     
     Scanner s=new Scanner(System.in);	  
     int day=s.nextInt();

     if(day ==1)
      System.out.println("Monday");
     else if(day ==2)
      System.out.println("tuesday'");
     else if(day ==3)
      System.out.println("Wednesday");
     else if(day ==4)
      System.out.println("Thursday");
     else if(day ==5) 
      System.out.println("Friday");
     else if(day ==6)
      System.out.println("Saturday");
     else if(day ==7)
      System.out.println("Sunday");
     else
      System.out.println("Not a valid digit for a day in a week");
  }
}

