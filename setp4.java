//4. Write a Java program to display Fibonacci series. 
import java.util.*;
class Fibonacci
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) 
      {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
