
import java.util.Scanner;

class vowel_consonant{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  char c=s.next().charAt(0); 
  if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
   System.out.println("character is a vowel");
  else
   System.out.println("character is a consonant");
 }
}
