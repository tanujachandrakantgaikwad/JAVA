//Write a java program to accept list of file names through command line. Delete the files 
//having extension .txt. Display name, location and size of remaining files.
import java.io.File;
class FileDeleteAndInfo
  {
    public static void main(String[] args)
 {
        if (args.length == 0) 
          {
            System.out.println("Please provide file names as command line arguments.");
            return;
        }
        for (String fileName : args) 
          {
            File f = new File(fileName);
            if (f.exists()) 
          {
                if (fileName.endsWith(".txt"))
              {       
                    if (f.delete())
                  {
                        System.out.println(fileName + " deleted.");
                    } 
         else
                   {
                        System.out.println("Unable to delete " + fileName);
                    }
                }
           else 
             {
                    // Display info of remaining files
                    System.out.println("File Name: " + f.getName());
                    System.out.println("Location: " + f.getAbsolutePath());
                    System.out.println("Size: " + f.length() + " bytes");
                    System.out.println("----------------------------");
                }
            } 
      else
             {
                System.out.println(fileName + " does not exist.");
            }
        }
    }
}
