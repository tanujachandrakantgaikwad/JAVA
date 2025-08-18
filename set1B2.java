//2. Write a java program to accept n numbers from a user store only Armstrong numbers in an array 
//and display it. 
import java.util.*;
class Armstrong
 {
    public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        System.out.println("Armstrong numbers are:");
        for (int i = 0; i < n; i++) 
    {
            System.out.print("Enter number ");
            int num = sc.nextInt();

            int temp = num, sum = 0;
            int digits = String.valueOf(num).length();  // count digits

            while (temp > 0) 
          {
                int d = temp % 10;
                sum = sum + (int)Math.pow(d, digits);
                temp = temp / 10;
            }

            if (sum == num) 
          {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
