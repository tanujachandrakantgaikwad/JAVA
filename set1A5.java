//5. Write a java program to display the vowels from a given string.
import java.util.*;
class Vowels 
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Vowels in the string are:");
              for (int i = 0; i < str.length(); i++) 
          {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.print(ch + " ");
            }
        }
    }
}
