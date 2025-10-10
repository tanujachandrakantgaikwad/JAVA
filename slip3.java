import java.util.Scanner;
class demo 
{
    static boolean isArm(int num) 
{
        int sum = 0, t = num;

        while (t > 0)
 {
            int digit = t % 10;
            sum =sum+ digit * digit * digit; 
            t=t/ 10;
        }

 return sum == num;
    }

    public static void main(String args[]) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArm(n))
 {
            System.out.println(n + " is Armstrong");
        } 
else
 {
            System.out.println(n + " is not Armstrong");
        }
    }
}
