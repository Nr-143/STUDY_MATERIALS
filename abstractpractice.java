import java.io.*;
abstract class abstract1{
     abstract1()
     {
        System.out.println("abstract class Constructor-1");
     }
abstract1 (int a)
{
    System.out.println("abstract class Constructor-2");
   // System.out.println("abstract class Constructor-2 Name"+name);
    System.out.println("abstract class Constructor-2 value"+ a);
}
    abstract void A();
}
class abstract2 extends abstract1
{
     abstract2(int a,String name)
{  
   super(2);  
  System.out.println("Constructor value "+a);  
  
  System.out.println("Constructor name "+name);
   
}
    void A()
     {
          System.out.println("Abstract method 1 from class 2");
     }
}
class abstract3 extends abstract2
{
     abstract3()
     {
          super(5,"Nirmal");
      }
     void A()
     {
         super.A();

System.out.println(" Abstract method 1 from class 3");
     }
}
class abstractpractice{
public static void main(String args[])
{
   abstract3 abstractobj1=new abstract3();
    abstractobj1.A();  
}
}
