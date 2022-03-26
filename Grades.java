
import java.util.Scanner;

class Grades{
 public static void main(String args[]){
 
 Scanner s=new Scanner(System.in);
 int physics=s.nextInt();
 int chemistry=s.nextInt();
 int biology=s.nextInt();
 int mathematics=s.nextInt();
 int computer=s.nextInt();
 float grade[]=new float[5];
 grade[0]=physics;
 grade[1]=chemistry;
 grade[2]=biology;
 grade[3]=mathematics;
 grade[4]=computer;

 System.out.println(+grade[0]);
 for(int i=0;i<5;i++) 
  { 
  if(grade[i]>=90)
   System.out.println("A");
  else if(grade[i]>=80)
   System.out.println("B");
  else if(grade[i]>=70)
   System.out.println("C");
  else if(grade[i]>=60)
   System.out.println("D");
  else
   System.out.println("F");
  }
 }
} 

