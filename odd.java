
class odd{
 public static void main(String args[]){
  boolean flag=true;

  int i=0;
  while(flag)
  {
    if(i%3==0)
    System.out.println(+i);
    ++i;
    if(i>100)
    flag=false;
  }
 }
}

