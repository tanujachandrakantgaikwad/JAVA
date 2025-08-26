//Write a Java program to calculate factorial of a number using recursion.
class Fact 
{
    int factorial(int n)
 {
        if (n == 0 || n == 1)
      {
            return 1;
        } 
    else 
      {
            return n * factorial(n - 1);
        }
    }

    public static void main(String arg[])
 {
        Fact f = new Fact();
        System.out.println("Factorial of 5 = " + f.factorial(5));
    }
}
