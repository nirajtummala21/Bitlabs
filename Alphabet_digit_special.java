
import java.util.Scanner;

class Alphabet_digit_special{

 public static void main(String args[]){
  Scanner s=new Scanner(System.in);

  char c=s.next().charAt(0);
  int p=s.nextInt();

  if((c>='a' && c<='z') ||(c>='A' && c<= 'Z')) 
      System.out.println(c+" is an ALphabet");
  else if( c>='0' && c<='9')
      System.out.println(c+" is a Digit");
  else
      System.out.println(c+"is a Special Character");
 }
}

 

