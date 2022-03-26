
import java.util.Scanner;
class Print_numStraight{
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int num =s.nextInt();
  boolean flag=true;
  int i=0;
  while(flag){
   System.out.println(+i);
   i++;
   if(i==num)
    flag=false;
  }
  }
}
