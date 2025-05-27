class Ex
{
    public static void main(String args[])
 { 
    try
     {
         int a=10;
         int c=a+3;
         int  d=a/0;
           System.out.println("Addition="+c);
          System.out.println("Div="+d);
     }
   catch(Exception e)
     {
           System.out.println("Error="+e);
    }
  } 
}