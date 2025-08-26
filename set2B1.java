//1. Define a class person(pid,pname,age,gender). Define Default and parameterised constructor. Overload the //constructor. Accept the 5 person details and display it.(use this keyword). 
class Person {
    int pid;
    String pname;
    int age;
    String gender;
    Person()
 {
        this.pid = 0;
        this.pname = "Unknown";
        this.age = 0;
        this.gender = "Not specified";
    }
      Person(int pid, String pname, int age, String gender)
   {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }
    void display() 
 {
        System.out.println("ID: " + this.pid +  ", Name: " + this.pname+ ", Age: " + this.age + ", Gender: " + this.gender);
    }

    public static void main(String[] args) 
{
        Person p1 = new Person(101, "Rahul", 22, "Male");
        Person p2 = new Person(102, "maya", 20, "Female");
        Person p3 = new Person(103, "om", 25, "Male");
        Person p4 = new Person(104, "Neha", 21, "Female");
        Person p5 = new Person(105, "Ravi", 23, "Male");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}

