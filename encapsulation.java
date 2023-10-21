import java.io.*;
import java.util.*;
class  Encapsulation2
{
   private String name;
   private int age;
   public void setName(String s)
   {
        this.name=s;
   } 
  public void setAge(int a)
  {
      this.age=a;
  }
  private void getName()
  {
    //  return name;
System.out.println(name);
 }
 public int getAge()
  {
      getName();
     return age;
    
 }
}
class encapsulation{
public static void main(String args[])
{
     PrintStream display=System.out;
      Scanner get=new Scanner(System.in);
      String name=get.nextLine();
      int age=get.nextInt();
      Encapsulation2 encapsulation2=new Encapsulation2();   
      encapsulation2.setName(name);
      encapsulation2.setAge(age);
    // String Name2=encapsulation2.getName();
     int Age=encapsulation2.getAge();
//display.println("Person Name:"+Name2);
//display.println("Person age:"+Age);  
try{
   // display.println("Name access from private:"+encapsulation2.getName());
   // display.println("Name access from private:"+encapsulation2.getAge());
}                                                                                                                   
catch(Exception e)
{
   display.println("Cant acces private  variable"+e);
}
}
}
