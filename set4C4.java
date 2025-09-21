//Write a java program to read the characters from a file, if a character is alphabet then 
//reverse its case, if not then display its category on the Screen. (whether it is Digit or Space)
import java.io.*;
class CharacterCategory
 {
    public static void main(String[] args) 
{
        try {
            FileReader fr = new FileReader("test.txt"); 
            int ch;

            while ((ch = fr.read()) != -1)
 {
                char c = (char) ch;

                if (Character.isUpperCase(c)) 
                {
                    System.out.print(Character.toLowerCase(c));
                } 
                else if (Character.isLowerCase(c)) 
                {
                    System.out.print(Character.toUpperCase(c)); 
                } 
                 else if (Character.isDigit(c)) 
                 {
                    System.out.println(c + " is a Digit");
                }
               else if (Character.isWhitespace(c)) 
                 {
                    System.out.println("Space detected");
                } 
               else
             {
                    System.out.println(c + " is a Special Character");
                }
            }

            fr.close();

        } catch (IOException e) 
      {
            System.out.println("Error: " + e);
        }
    }
}
