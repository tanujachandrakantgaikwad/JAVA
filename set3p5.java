 //Create a package Mathematics with two classes Maximum and Power. Write a java 
//program to accept two numbers from user and perform the following operations on //it: a. Find Maximum of two numbers. 
//b. Calculate the power(XY); 
import java.util.*;

class Maximum
 {
    public int findMax(int a, int b)
 {
        if (a > b)
            return a;
        else
            return b;
    }
}

class Power 
{
    public double findPower(int x, int y) 
  {
        return Math.pow(x, y); 
    }
}
 class Main
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Maximum maxObj = new Maximum();
        Power powObj = new Power();

        System.out.println("Maximum = " + maxObj.findMax(a, b));
        System.out.println(a + " ^ " + b + " = " + powObj.findPower(a, b));
    }
}
