//10. Write a java program to calculate the sum of even numbers from an array.
import java.util.Scanner;
class SumEvenArray
 {
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter n elements:");
        for (int i = 0; i < n; i++) 
       {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
       
        for (int i = 0; i < n; i++)
       {
            if (arr[i] % 2 == 0)
         {
                sum += arr[i];
            }
        }
        System.out.println("Sum of even numbers = " + sum);
    }
}
