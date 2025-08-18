// Write a java Program to calculate the sum of first and last digit of a number. 
import java.util.*;
class SumFirstLast 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int last = num % 10;   
        int first = num;
        while (first >= 10) 
       {   
            first = first / 10;
        }
        int sum = first + last;
        System.out.println("First digit = " + first);
        System.out.println("Last digit = " + last);
        System.out.println("Sum of first and last digit = " + sum);

    }
}
