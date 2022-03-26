
import java.util.Scanner;

class Salary{
 public static void main(String args[]){
 
 Scanner s=new Scanner(System.in);
 int Basic=s.nextInt();
 int Basic1=s.nextInt();
 int Basic2=s.nextInt();

 double gross[]=new double[3]; 
 gross[0]=Basic*0.2+Basic*0.8+Basic;
 gross[1]=Basic1*0.25+Basic1*0.9+Basic1;
 gross[2]=Basic2*0.3+Basic2*0.95+Basic2;

 for(int i=0;i<3;i++)
  System.out.println(+gross[i]);
 }
}

