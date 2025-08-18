//3. Write a java Program to accept employee name from a user and display it in reverse order. 
import java.util.*;
class ReverseName
 {
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) 
        {
            reverse = reverse + name.charAt(i);
        }
        System.out.println("Reversed Name: " + reverse);
    }
}
