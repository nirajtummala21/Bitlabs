
import java.util.Scanner;

public class frequency{
 public static void main(String args[]){
  System.out.println("Enter a string value ::");

  Scanner s=new Scanner(System.in);
  String str=s.nextLine();

  System.out.println("Enter a particular charcater ::");
  char character=s.nextLine().charAt(0);

  int count=0;

  for(int i=0;i<str.length();i++)
  {
   if(character ==str.charAt(i)){
     count++;
   }
  }
  System.out.println("frequency of the given character::"+count);
 }
}
