//Write a Java program to accept two numbers using command line argument and calculate 
//addition, subtraction, multiplication and division. 
class ArithmeticOperations 
  {
    public static void main(String[] args) 
    {
            if (args.length < 2) 
       {
            System.out.println(" command line arguments.");
            return;
        }
         int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("divition = " + (a / b));

    }
}
