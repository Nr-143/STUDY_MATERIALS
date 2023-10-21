import java.io.*;
import java.util.*;
import java.lang.*;
class MyException extends Exception
{
   public MyException(String s)
{
  super(s);
}

}
class exception
{
public static void main(String args[]) 
{
     PrintStream obj=System.out;
     int a,b;
    try(Scanner get=new Scanner(System.in)){
            a=get.nextInt();
            b=get.nextInt();
  if(a<0 | b==0)
{
    throw new MyException(" unexpectedexception");
}
            obj.println(a/b);
         }
catch(MyException e)
{
      System.out.println(e.getMessage());
     StackTraceElement cause[]=e.getStackTrace();
        for(int i=0;i<cause.length;i++)
{
System.out.println(cause[i].getFileName()+">>>"+
                                          cause[i].getLineNumber()+">>>"+
                                          cause[i].getMethodName()+"()"
                                       );
}
}
}
}
