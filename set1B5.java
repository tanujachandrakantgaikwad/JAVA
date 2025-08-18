/*5. Write a java program to display following pattern: 
1  
0 1 
0 1 0 
1 0 1 0*/
class Pattern
 {
    public static void main(String[] args)
     {
          int ch=1;
        int n = 4;
        for (int i = 1; i <= n; i++) 
       {
            for (int j = 1; j <= i; j++) 
          {
                 int a=ch%2;
                  System.out.printf("%d",a);
                     ch=ch+1;
            }
            System.out.println();
        }
    }
}
