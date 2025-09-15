//Create a class Teacher(Tid, Tname, Designation, Salary, Subject). Write a Java //program to accept the details of ‘n’ teachers and display the details of teacher who is //teaching Java Subject.(Use array of Object) 
import java.util.Scanner;
class Teacher
 {
    int Tid;
    String Tname, Designation, Subject;
    double Salary;

    Teacher(int id, String name, String desg, double sal, String sub) {
        Tid = id;
        Tname = name;
        Designation = desg;
        Salary = sal;
        Subject = sub;
    }
    void display() 
 {
        System.out.println("ID: " + Tid);
        System.out.println("Name: " + Tname);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + Salary);
        System.out.println("Subject: " + Subject);
        System.out.println("---------------------");
    }
}
class Main 
 {
    public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Teacher[] teachers = new Teacher[n];
        for (int i = 0; i < n; i++) 
     {
            System.out.println("\nEnter details of teacher " + (i + 1) + ":");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Designation: ");
            String desg = sc.nextLine();

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Subject: ");
            String sub = sc.nextLine();

            teachers[i] = new Teacher(id, name, desg, sal, sub);
        }
        System.out.println("\nTeachers teaching Java Subject:");
        boolean found = false;
        for (int i = 0; i < n; i++) 
      {
            if (teachers[i].Subject.equalsIgnoreCase("Java"))
         {
                teachers[i].display();
                found = true;
            }
        }

        if (!found)
    {
            System.out.println("No teacher found teaching Java.");
        }

     }
}
