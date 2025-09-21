//Write a java program to check whether given candidate is eligible for voting or not. 
//Handle user defined as well as system defined Exception. 
import java.util.*;
class InvalidAgeException extends Exception 
{
    InvalidAgeException(String msg) 
{
        super(msg);
    }
}

class Voting
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();   
            if (age < 18) 
           {
                throw new InvalidAgeException("Not eligible for voting (age < 18)");
            }

            System.out.println("Eligible for voting!");

        } catch (InvalidAgeException e)
         {  
                   System.out.println(e.getMessage());
        } catch (Exception e) 
       {  
                      System.out.println("System Exception: " + e);
        }
    }
}
