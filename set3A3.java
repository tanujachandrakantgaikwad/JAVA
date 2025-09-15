//Define an Interface “Integer” with a abstract method check().Write a Java program //to check whether a given number is Positive or Negative. 
import java.util.*;
interface IntegerCheck 
{
    void check(int n);   
}
class NumberCheck implements IntegerCheck 
{
    public void check(int n) 
{
        if (n > 0)
            System.out.println(n + " is Positive");
        else if (n < 0)
            System.out.println(n + " is Negative");
        else
            System.out.println("Number is Zero");
    }
}
 class Main
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        NumberCheck obj = new NumberCheck();
        obj.check(num);

        sc.close();
    }
}
