//2.. Write a java Program to display all the perfect numbers between 1 to n. 
import java.util.*;
class PerfectNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
           System.out.println("Perfect numbers ");

        for (int num = 1; num <= n; num++)
      {
            int sum = 0;
            for (int i = 1; i < num; i++) 
          {
                if (num % i == 0)
                  {
                    sum += i;
                }
            }
                    if (sum == num) 
            {
                System.out.println(num);
            }
        }
    }
}
