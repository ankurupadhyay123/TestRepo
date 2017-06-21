import java.io.*;

class Pro9
{
 public static void main(String args[])
 {
  try
  {
   StringBuilder o=new StringBuilder();
   FileInputStream file=new FileInputStream("myfile");
	
   int i=0;
    while((i=file.read())!=-1)
    {
     char r=(char)i;
     o.append(r);
     }
     System.out.println("After append:"+o);
     file.close();
    }
    catch (Exception e)
   {
    System.out.println(e);
    }
  }
}
