
import java.util.*;

public class Number{
 public static void main(String args[]){
  String nos[]={"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

  Scanner s=new Scanner(System.in);
  System.out.print("Enter the Number:");
  int no=s.nextInt();

  int r;
  string res=" ";
  while(no>0)
  {
   r=no%10;
   res=nos[r]+" "+res;
   no/=10;
  }
   System.out.print("\n"+res);
 }
}

