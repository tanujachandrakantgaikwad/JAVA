//4. Write a java program to display all the even numbers from an array. (Use Command Line arguments) 
class Even
{
    public static void main(String[] args) 
   {
        System.out.println("Even numbers:");
        for (int i = 0; i < args.length; i++)
      {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) 
         {
                System.out.println(num);
            }
        }
    }
}
