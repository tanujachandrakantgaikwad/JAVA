import java.io.*;
import java.util.*;

class Demo
 {
    public static void main(String[] args) 
{
        try 
        {
            Scanner sc = new Scanner(System.in);
            FileWriter f1 = new FileWriter("tan.txt");
            System.out.print("Enter String: ");
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++)
              {
                f1.write((int) s.charAt(i) + "\n"); 
              }
            f1.close();
            System.out.println("ASCII values");
            sc.close();
        } 
       catch (Exception e)
          {
            System.out.println("Error="+e);
        }
    }
}
