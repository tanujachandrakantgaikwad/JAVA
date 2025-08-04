class Demo
{
 public static void main(String args[])  
  {
        int a=0,b=0,c=0,d=0,n=32;
       try
          {
             a=n+21;
             b=n-2;
             c=n/0;
            d=n*9;
            System.out.println(a);
          }finally
         {
           System.out.println("Addition="+a);
          System.out.println("sub="+b);
           System.out.println("Div="+c);
           System.out.println("mul="+d);
        }
   }
 }