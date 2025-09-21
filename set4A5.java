//Write a java program to accept a number from user, If it is greater than 100 then throw 
//user defined exception “Number is out of Range” otherwise do the addition of digits of 
//that number. (Use static keyword) 
import java.util.*;
class OutOfRangeException extends Exception
 {
    OutOfRangeException(String msg)
  {
        super(msg);
    }
}
class SimpleDigitAddition 
{
    static int sumDigits(int n) 
    {
        int sum = 0;
        while (n > 0) 
       {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) 
      {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 100) 
          {
                throw new OutOfRangeException("Number is out of Range");
            }

            System.out.println("Sum of digits: " + sumDigits(num));

        } catch (OutOfRangeException e)
    {
            System.out.println(e.getMessage());
        } catch (Exception e) 
         {
            System.out.println("Invalid input!");
        }
    }
}
