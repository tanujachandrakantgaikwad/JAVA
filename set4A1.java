//Write a java program to count the number of integers from a given list.(Use command line arguments). 
class CountIntegers 
{
    public static void main(String[] args) 
{
        int count = 0;

        for (String arg : args) 
   {
            try 
     {
                Integer.parseInt(arg);
                count++;
            } catch (NumberFormatException e) 
         {
               System.out.println("Error="+e);
         }
        }

        System.out.println("Total number of integers: " + count);
    }
}
