// Write a java program to accept a number from a user, if it is zero then throw user defined 
//Exception “Number is Zero”. If it is non-numeric then generate an error “Number is 
//Invalid” otherwise check whether it is palindrome or not. 
import java.util.*;
class ZeroException extends Exception
  {
    ZeroException(String msg)
  {
        super(msg);
    }
}

class SimplePalindrome
 {
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            int n = Integer.parseInt(input); 

            if (n == 0) 
          {
                throw new ZeroException("Number is Zero");
            }

            int original = n, rev = 0;
            while (n > 0) 
           {
                rev = rev * 10 + n % 10;
                n /= 10;
            }

            if (original == rev)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");

        } catch (ZeroException e) 
        {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e)
        {
            System.out.println("Number is Invalid");
        }
    }
}
