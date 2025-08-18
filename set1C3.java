//3. Write a java program for union of two integer array.

import java.util.*;
class UnionArray 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit for first array: ");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter n numbers:");
        for (int i = 0; i < n1; i++)
       {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter limit for  second array: ");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter n number");
        for (int i = 0; i < n2; i++)
       {
            b[i] = sc.nextInt();
        }
   Set<Integer> unionSet = new HashSet<Integer>();

            for (int i = 0; i < n1; i++) 
      {
            unionSet.add(a[i]);
        }

           for (int i = 0; i < n2; i++) 
         {
            unionSet.add(b[i]);
        }

        System.out.println("Union of arrays:");
        for (int num : unionSet) 
       {
            System.out.print(num + " ");
        }
    }
}
 