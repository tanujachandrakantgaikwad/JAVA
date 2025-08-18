//1. Write a java program to accept n city names and display them in ascending order. 
import java.util.*;
import java.util.Arrays;
class CityNames 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit ");
        int n = sc.nextInt();
        sc.nextLine();  
        String cities[] = new String[n];

        for (int i = 0; i < n; i++)
     {
            System.out.print("Enter city name ");
            cities[i] = sc.nextLine();
        }

        Arrays.sort(cities);

        System.out.println("\n Cities in Ascending Order:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(cities[i]);
        }
    }
}
