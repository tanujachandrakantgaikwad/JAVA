class MyNumber
{
    private int n;
     MyNumber()
    {
        n=0;
   }
   MyNumber(int n)
    {
        this.n=n;
   }
   boolean isnegative()
   {
      if(n<0)
         return true;
     else
        return false;
   }
   boolean ispositive()
   {
      if(n>0)
         return true;
     else
        return false;
   }
  public static void main(String args[]) 
  {
      MyNumber ob=new MyNumber(54);
     if(ob.isnegative())
         System.out.println("Number is -ve");
    else
         System.out.println("Number is +ve");
     }
}