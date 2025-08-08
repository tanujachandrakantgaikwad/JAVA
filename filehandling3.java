//Count number of upper,lower characters,digits,lines and //symbols.........
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
        if(k>='A'&&k<='Z')
            c1++;
        else if(k>='a'&&k<='z')
           c2++;
        else if(k>='0'&&k<='9')
          c3++;
        else if(k=='\n')
           c4++;
        else
           c5++; 
      }
     System.out.printf("\nUpper char=%d",c1);
     System.out.printf("\nLower char=%d",c2);
     System.out.printf("\nDigits=%d",c3);
     System.out.printf("\nLines=%d",c4);
     System.out.printf("\nSymbols=%d",c5);
    }
    catch(Exception e)
    {
     System.out.println("Error="+e);
  }
}
}