
import java.util.Scanner;

public class LowerUpperCase{
 public static void main(String args[]){

  Scanner s =new Scanner(System.in);

  char ch=s.next().charAt(0);

  if(ch>='A' && ch<='Z'){
   System.out.println(ch +" i Uppercase alphabet");

  } else if(ch >='a' && ch <='z') {
     System.out.println(ch +"is Lowercase alphabet");
 }
 else {
System.out.println(ch+" is not a alphabet");
 }
 }
}

