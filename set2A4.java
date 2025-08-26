// Write a Java program to Copy data of one object to another Object.
class Student 
{
    int id;
    String name;
    Student(int i, String n)
 {
        id = i;
        name = n;
    }
    Student(Student s) 
 {
        id = s.id;
        name = s.name;
    }

    void display() 
  {
        System.out.println("ID: " + id + "  Name: " + name);
    }

    public static void main(String[] args) 
{
        Student s1 = new Student(101, "Tanuja");
        Student s2 = new Student(s1);
        System.out.println("Original Object:");
        s1.display();

        System.out.println("Copied Object:");
        s2.display();
    }
}
