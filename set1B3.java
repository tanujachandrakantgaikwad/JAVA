//Write a java program to search given name into the array, if it is found then display its index 
//otherwise display appropriate message. 
import java.util.*;
class Search
 {
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        String names[] = {"Tanuja", "Riya", "Sakshi", "Neha", "Pooja"};

        System.out.print("Enter name to search: ");
        String search = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < names.length; i++) 
     {
            if (names[i].equalsIgnoreCase(search))
           {
                System.out.println("Name found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) 
       {
            System.out.println("Name not found.");
        }
    }
}
