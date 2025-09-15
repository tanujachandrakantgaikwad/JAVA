//Write a java program to accept ‘n’ integers from the user & store them in an //ArrayList collection. Display the elements of ArrayList collection in reverse order. 
import java.util.*;
 class Main 
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        ArrayList numbers = new ArrayList(); 

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        // Accept numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());     
    }
        System.out.println("\nNumbers in Reverse Order:");
        for (int i = numbers.size() - 1; i >= 0; i--)
 {
            System.out.println(numbers.get(i));
        }

        sc.close();
    }
}

