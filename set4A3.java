//Write a java program to calculate the size of a file. 
import java.io.File;
class FileSizeSimple 
{
    public static void main(String[] args)
 {
        File f = new File("test.txt");   
        if (f.exists())
   {
            System.out.println("File size: " + f.length() + " bytes");
        } 
   else 
          {
            System.out.println("File not found!");
        }
    }
}
