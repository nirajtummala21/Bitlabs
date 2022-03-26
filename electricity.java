
import java.util.Scanner;

class electricity{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();
  double bill=0.0;
  if(num<50)
   bill=num*0.50+num*0.2;
  if(num>50 && num<=150)
   bill=num*0.75+num*0.2;
  if(num>150 && num<=250)
   bill=num*1.2+num*0.2;
  if(num>250)
   bill=num*1.5+num*0.2;

  System.out.println(+bill);
 }
}
