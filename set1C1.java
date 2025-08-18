//. Write a java program to count the frequency of each character in a given string. 
import java.util.*;
class Frequency 
 {
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replace(" ", "");

            for (int i = 0; i < str.length(); i++) 
          {
            char ch = str.charAt(i);
            int count = 0;
            if (str.indexOf(ch) < i)
         {
                continue;
            }
            for (int j = 0; j < str.length(); j++)
          {
                if (str.charAt(j) == ch)
              {
                    count++;
                }
            }
            System.out.println( count);
        }
    }
}
