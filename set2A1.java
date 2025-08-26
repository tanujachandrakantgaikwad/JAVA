//Write a Java program to calculate power of a number using recursion.
class PowerRecursion 
{
       static int power(int base, int exp) 
  {
        if (exp == 0)   
            return 1;
        else
            return base * power(base, exp - 1); 
    }

    public static void main(String[] args) 
 {
        int base = 2, exp = 5; 
        int result = power(base, exp);

        System.out.println(base + " ^ " + exp + " = " + result);
    }
}
