//Write a java program to accept details of  ‘n’  cricket players(pid, pname, totalRuns, InningsPlayed, NotOuttimes). //Calculate the average of all the players. Display the details of player having maximum average.
import java.util.Scanner;
class Player
 {
    int pid, runs, innings, notOut;
    String name;
    double avg;

    void accept(Scanner sc) 
    {
        System.out.print("Enter Player ID: ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Player Name: ");
        name = sc.nextLine();
        System.out.print("Enter Total Runs: ");
        runs = sc.nextInt();
        System.out.print("Enter Innings Played: ");
        innings = sc.nextInt();
        System.out.print("Enter Not Out Times: ");
        notOut = sc.nextInt();

        int dismissals = innings - notOut;
        if (dismissals > 0)
            avg = (double) runs / dismissals;
        else
            avg = runs;  
    }
    void display() 
{
        System.out.println(pid + "  " + name + "  Runs:" + runs +"  Avg:" + avg);
    }
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter player limit");
        int n = sc.nextInt();

        Player p[] = new Player[n];

        for (int i = 0; i < n; i++)
   {
            System.out.println("\nEnter details of Player " + (i + 1));
            p[i] = new Player();
            p[i].accept(sc);
        }
        Player max = p[0];
        for (int i = 1; i < n; i++) 
    {
            if (p[i].avg > max.avg)
        {
                max = p[i];
            }
        }
        System.out.println("\n--- Player Details ---");
        for (int i = 0; i < n; i++)
      {
            p[i].display();
        }
        System.out.println("\n--- Player with Maximum Average ---");
        max.display();
    }
}
