class Ex
{
   public static void main(String agrs[])
   {
       int b=0,c=0,d=0,e=0;
        try
        {
             int a=32;
             e=a+3;
             b=a-9;
             c=a/0;
             d=a*2;
          }   
         catch(Exception e1)
          {
             System.out.println("Error="+e1);
          }
        finally
           {
             System.out.println("Addition="+e);
             System.out.println("sub="+b);
            System.out.println("div="+c);
            System.out.println("multi="+d);
           }
    }
}