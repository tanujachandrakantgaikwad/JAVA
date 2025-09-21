//Write a java program to accept string from a user. Write ASCII values of the characters 
//from a string into the file.
import java.io.*;
import java.util.Scanner;
class WriteASCII 
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("ascii.txt");
            for (int i = 0; i < str.length(); i++) 
         {
                char c = str.charAt(i);
                fw.write((int) c + " "); 
            }

            fw.close();
            System.out.println("ASCII values written to ascii.txt");

        } catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
