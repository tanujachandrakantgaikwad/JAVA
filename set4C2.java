//Write a java program to display the files having extension .txt from a given directory.
import java.io.File;
import java.util.Scanner;
class DisplayTxtFiles
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dirPath = sc.nextLine();

        File dir = new File(dirPath);

        if (dir.exists() && dir.isDirectory())
      {
            String[] files = dir.list(); 
            System.out.println(".txt files in the directory:");
            for (String file : files) 
           {
                if (file.endsWith(".txt")) 
            {
                    System.out.println(file);
                }
            }
        } 
    else
         {
            System.out.println("Directory does not exist!");
        }

        sc.close();
    }
}
