class Ex
{
    public static void main(String args[])
 { 
    try
     {
         int a[]=new int[-3];
        System.out.printf("Array Created");
         a[0]=32;
         a[2]=12;
          a[10]=20;
          System.out.printf("value is Inserted");
     }
   catch(Exception e)
     {
           System.out.println("Error="+e);
    }
  } 
}