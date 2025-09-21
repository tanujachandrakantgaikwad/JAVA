//Write a java program to accept a number from a user, if it less than 5 then throw user 
//defined Exception “Number is small”, if it is greater than 10 then throw user defined 
//exception “Number is Greater”, otherwise calculate its factorial. 
import java.util.*;
class NumberException extends Exception 
{
    NumberException(String msg) 
   {
        super(msg);
    }
}

class FactorialCheck 
{
    public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in);
        try 
         {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 5)
             {
                throw new NumberException("Number is small");
            }
             else if (num > 10) 
           {
                throw new NumberException("Number is Greater");
            } 
        else
         {
                int fact = 1;
                for (int i = 1; i <= num; i++) 
             {
                    fact *= i;
                }
                System.out.println("Factorial of " + num + " is " + fact);
            }

        } catch (NumberException e)
 {
            System.out.println(e.getMessage());
        } catch (Exception e)
 {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
