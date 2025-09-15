//Write a Java program to accept ‘n’ employee names through command line, Store //them in vector. Display the name of employees starting with character ‘S’. 
import java.util.*;
 class Main
 {
    public static void main(String[] args) 
{
        Vector<String> employees = new Vector<String>(); 
        employees.add("Sunita");
        employees.add("Amit");
        employees.add("Sneha");
        employees.add("Rajesh");
        employees.add("Sachin");

        System.out.println("Employees starting with 'S':");
        for (String emp : employees)
 {
            if (emp.startsWith("S") || emp.startsWith("s")) 
      {
                System.out.println(emp);
            }
        }
    }
}

