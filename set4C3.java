//Write a java program to count number of lines, words and characters from a given file.
import java.io.*;
class SimpleFileCount 
{
    public static void main(String[] args)
 {
        try {
            FileReader fr = new FileReader("test.txt"); 
            int ch;
            int lines = 0, words = 0, chars = 0;
            boolean wordStarted = false;

            while ((ch = fr.read()) != -1) 
        {
                chars++; 
                if (ch == '\n') 
           {
                    lines++;
                }

                if (Character.isWhitespace(ch)) 
             {
                    wordStarted = false;
                } 
                 else if (!wordStarted) 
               {
                    words++; 
                    wordStarted = true;
                }
            }

            fr.close();
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

        } catch (IOException e) 
           {
            System.out.println("Error: " + e);
        }
    }
}
