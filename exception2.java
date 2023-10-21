import java.io.*;
import java.util.*;
class Exception4 extends Exception
{
   public Exception4(String s)
{
    super(s);
}
}
class Exception3
{
    int div(int a, int b) throws Exception4
   {
if(a<0 || b==0){
        throw new Exception4("invalid input");
}
      int c=a/b;
      return c;

  }
}
class exception2{
public static void main(String args[]){
    Scanner get=new Scanner(System.in);
    PrintStream obj=System.out;
    int result=0;
    int a=get.nextInt();
    int b=get.nextInt();
    Exception3 exception=new Exception3();
try{
    result=exception.div(a,b);  
    obj.println("Result without Exception..."+result);
}
catch(Exception e)
{
   obj.println(e);
}
System.out.println(result);
}
}
