
import java.util.Scanner;

class max3{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  int c=s.nextInt();

  int max=(a>b)?a:b;
  max=(max>c)?max:c;

  System.out.println(+max);
 }
}

