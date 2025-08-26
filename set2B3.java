//Define a class Student(rollno,name,per). Create n objects of the student class and Display 
//it using toString().(Use parameterized constructor)
class Student 
{
    int rollno;
    String name;
    double per;

    Student(int rollno, String name, double per) 
{
        this.rollno = rollno;
        this.name = name;
        this.per = per;
    }

    public String toString()
 {
        return "Roll No: " + rollno + ", Name: " + name + ", Percentage: " + per;
    }

    public static void main(String[] args) 
{
        Student[] students = new Student[3];

        students[0] = new Student(101, "om", 85.5);
        students[1] = new Student(102, "sai", 90.2);
        students[2] = new Student(103, "ram", 78.9);

        System.out.println("--- Student Details ---");
        for (int i = 0; i < students.length; i++) 
    {
            System.out.println(students[i]); 
        }
    }
}
