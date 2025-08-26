//4. Write a Java program to calculate sum of digits of a number using Recursion. 
class SumDigits
 {
        static int sum(int n) 
  {
        if (n == 0)   
            return 0;
        else
            return (n % 10) + sum(n / 10);  
    }

    public static void main(String[] args)
 {
        int num = 1234;   
        int result = sum(num);

        System.out.println("Sum of digits: " + result);
    }
}
