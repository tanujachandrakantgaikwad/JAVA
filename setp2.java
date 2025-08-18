//2)Write a Java program which accepts three integer values and prints the maximum and minimum. 
import java.util.*;
class MaxMin
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        sc.close();
    }
}
