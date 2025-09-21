//Write a java program to display contents of a file in reverse order. 
import java.io.*;
class ReverseFileDisplay 
{
    public static void main(String[] args)
 {
        String fileName = "test.txt"; 
        try {
            FileReader fr = new FileReader(fileName);
            StringBuilder content = new StringBuilder();

            int ch;
            while ((ch = fr.read()) != -1) 
        {
                content.append((char) ch);
            }

            fr.close();

            content.reverse();
            System.out.println("File content in reverse:");
            System.out.println(content);

        } catch (IOException e) 
      {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
