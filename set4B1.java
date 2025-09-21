//Write a java program to copy the data from one file into another file, while copying 
//change the case of characters  in target file and replaces all digits by ‘*’ symbol. 
import java.io.*;
class SimpleFileCopy 
{
    public static void main(String[] args)
 {
        try {
            FileReader fr = new FileReader("test.txt");  
            FileWriter fw = new FileWriter("target.txt");  

            int ch;
            while ((ch = fr.read()) != -1) 
    {
                char c = (char) ch;

                if (Character.isUpperCase(c))
                    c = Character.toLowerCase(c);
                else if (Character.isLowerCase(c))
                    c = Character.toUpperCase(c);

                if (Character.isDigit(c))
                    c = '*';

                fw.write(c);
            }

            fr.close();
            fw.close();

            System.out.println("File copied and transformed!");
        } catch (Exception e)
      {
            System.out.println("Error: " + e);
        }
    }
}
