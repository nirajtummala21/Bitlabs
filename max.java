
import java.util.Scanner;

class max{
 public static void main(String args[]){
   Scanner s=new Scanner(System.in);
 //  Scanner t=new Scanner(System.in);

   int n=s.nextInt();
   int m=s.nextInt();
   int max=(m>n)?m:n;

   System.out.println(+max);

 }
}
