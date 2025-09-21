//Write a java program to display each word from a file in reverse order.
import java.io.*;
class ReverseWordsSimple 
{
    public static void main(String[] args)
 {
        try {
            FileReader fr = new FileReader("test.txt");
            StringBuilder sb = new StringBuilder();
            int ch;

            // Read entire file
            while ((ch = fr.read()) != -1) 
            {
                sb.append((char) ch);
            }
            fr.close();

            String[] words = sb.toString().split(" "); 

            System.out.println("Reversed words from the file:");
            for (String word : words)
         {
                       System.out.print(new StringBuilder(word).reverse() + " ");
            }

        } catch (Exception e) 
     {
            System.out.println("Error: " + e);
        }
    }
}
