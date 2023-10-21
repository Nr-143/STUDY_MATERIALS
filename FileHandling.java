import java.io.*;
class FileHandling
{
public static void main(String args[])
{
          File file1=new File("C:\\Users\\student\\Desktop\\file handling\\gokul\\kavin");
          PrintStream obj=System.out;
 try{ 
         boolean folderExists=file1.exists();
         if(folderExists==false)
         {
             boolean folderCreated=file1.mkdirs();    
             if(folderCreated==true) 
            {
               obj.println("Folder created");
               File file2=new File("C:\\Users\\student\\Desktop\\file handling\\gokul\\kavin\\l.txt");
              boolean fileCreated=file2.createNewFile();
              if(fileCreated==true)
              {
                  obj.println("File created ");
                  // file2.delete();  
                  boolean fileExists=file2.exists();
                  if(fileExists==true)
                  {
                      obj.println("File not deleted");
                     File file3=new File("C:\\Users\\student\\Desktop\\file handling\\gokul\\kavin\\lara.txt");
                     file2.renameTo(file3);
                     obj.println(" current file name is:"+file3.getName());
                     File file4=new File("C:\\Users\\student\\Desktop\\file handling");
                    File[] FilesFolders=  file4.listFiles();
                    for(File ff:FilesFolders)
                   {
                      if(ff.isFile())
                      { 
                             String fileName  =ff.getName();  int indexValue=fileName.lastIndexOf(".");
                            String extension=fileName.substring(indexValue+1);
                             if (extension.equals("txt"))
                             {  
                                     obj.println(fileName);  
                             }    
                       }
                  }
                  else
                  {
                      obj.println("File deleted");
                  }
          }
       else{
             obj.println("File not created");
              }
     } 
 }
else{
  obj.print("Already exists");
   }
     File file5=new File("C:\\Users\\student\\Desktop\\file handling\\lara.txt");
     FileWriter writer=new FileWriter(file5,true);
     BufferedWriter bwriter=new BufferedWriter(writer);
     FileReader reader=new FileReader(file5);
     BufferedReader breader= new BufferedReader(reader);
     bwriter.write("Hello world");
     bwriter.flush();
String line1=breader.readLine();
while(line1!=null)
 {
    System.out.println(line1);
     line1=breader.readLine();
 }
}

catch(Exception e)
{
  obj.println(e);
}
}
}
