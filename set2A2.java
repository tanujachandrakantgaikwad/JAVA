//Write a Java program to display Fibonacci series using function. 
class FibonacciRecursion 
{
    static int fib(int n) 
{
        if (n == 0) 
            return 0;
        else if (n == 1) 
            return 1;
        else 
            return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) 
{
        int terms = 7; 
        System.out.print("Fibonacci Series: ");
        
        for (int i = 0; i < terms; i++)
      {
            System.out.print(fib(i) + " ");
        }
    }
}
