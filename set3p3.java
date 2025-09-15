//Create a class Doctor(Dno, Dname, Qualification, Specialization). Write a Java //program to accept the details of ‘n’ doctors and display the details of doctor in //ascending order by doctor name.
import java.util.*;
class Doctor
 {
    int Dno;
    String Dname, Qualification, Specialization;
    Doctor(int no, String name, String qual, String spec) 
  {
        Dno = no;
        Dname = name;
        Qualification = qual;
        Specialization = spec;
    }
    void display() 
  {
        System.out.println("ID: " + Dno);
        System.out.println("Name: " + Dname);
        System.out.println("Qualification: " + Qualification);
        System.out.println("Specialization: " + Specialization);
        System.out.println("-----------------------");
    }
}
 class Main 
  {
    public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of doctors: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Doctor[] doctors = new Doctor[n];
        for (int i = 0; i < n; i++) 
    {
            System.out.println("\nEnter details of doctor " + (i + 1) + ":");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Qualification: ");
            String qual = sc.nextLine();

            System.out.print("Enter Specialization: ");
            String spec = sc.nextLine();

            doctors[i] = new Doctor(id, name, qual, spec);
        }

             Arrays.sort(doctors, new Comparator<Doctor>() 
     {
            public int compare(Doctor d1, Doctor d2) 
      {
                return d1.Dname.compareToIgnoreCase(d2.Dname);
            }
        });

        System.out.println("\nDoctors in Ascending Order by Name:");
        for (int i = 0; i < n; i++) 
      {
            doctors[i].display();
        }

    }
}
