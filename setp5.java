//5)Write a Java program to calculate sum of digits of a number. 
import java.util.*;
class SumOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
            while (num > 0)
       {
            int digit = num % 10;             
           sum = sum + digit;      
            num = num / 10;        
       }

        System.out.println("Sum of digits = " + sum);
         }
}
