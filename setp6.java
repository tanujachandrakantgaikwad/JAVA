//6)Write a Java program to accept a year and check if it is leap year or not. 
import java.util.*;
class LeapYear 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

           if (year % 4 == 0)
        {
            System.out.println( " Leap Year.");
        } 
       else
        {
            System.out.println(" Leap Not Year.");
        }
    }
}
