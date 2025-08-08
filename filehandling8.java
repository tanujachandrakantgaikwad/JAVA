/*Write a java program to count number of lines, words and characters from a given file.*/
import java.io.*;
class Demo
{
  public static void main(String args[])
  {
    try
    {
      FileInputStream f1=new FileInputStream("abc.txt");
      int k,c1=0,c2=0,c3=0,c4=0,c5=0;
      while((k=f1.read())!=-1)
      {
        if(k=='\n')
            c1++;
        else if(k==' ')
           c2++;
        else if(k>='a'&&k<='z'||k>='A'&&k<='Z')
          c3++;
        else 
           c4++;
         }
     System.out.printf("\n Lines=%d",c1);
     System.out.printf("\n  words=%d",c2);
    System.out.printf("\n  character=%d",c3);
    System.out.printf("\n other=%d",c4);

    }
    catch(Exception e)
    {
     System.out.println("Error="+e);
  }
}
}