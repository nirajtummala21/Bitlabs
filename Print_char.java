
class Print_char{
 public static void main(String args[]){
  char ch='a';
  boolean flag=true;
  while(flag)
  {
   System.out.println(ch);
   ch++;
   if(ch=='z')
    flag=false;
  }
 }
}
