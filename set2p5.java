 //Write a Java program to for the implementation of this keyword. 
class Student
 {
    String name;
    int age;
    Student(String name, int age)
 {
        this.name = name;   
        this.age = age;    
    }
    void display() 
 {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public static void main(String[] args)
 {
        Student s1 = new Student("Tanuja", 20);
        s1.display();

        Student s2 = new Student("Omkar", 22);
        s2.display();
    }
}
