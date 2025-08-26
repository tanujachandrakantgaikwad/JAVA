 //Write a java program to accept n employee names from user. Sort them in ascending 
//order and Display them.(Use array of object nd Static keyword) 
import java.util.*;
class Employee 
{
    String name;
    static Scanner sc = new Scanner(System.in);
    void accept() 
 {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }
      void display()
  {
        System.out.println(name);
    }

    public static void main(String[] args) 
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++)
    {
            emp[i] = new Employee();
            emp[i].accept();
        }
            String[] names = new String[n];
        for (int i = 0; i < n; i++) 
   {
            names[i] = emp[i].name;
        }
        Arrays.sort(names);
        System.out.println("\n--- Employee Names in Ascending Order ---");
        for (int i = 0; i < n; i++)
     {
            System.out.println(names[i]);
        }
    }
}
