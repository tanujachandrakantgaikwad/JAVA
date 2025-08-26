//Write a Java program to for the implementation of reference variable. 
class Student
 {
    String name;
    int age;

    public static void main(String[] args)
 {
        Student s1 = new Student();
        s1.name = "Tanuja";
        s1.age = 20;

          Student s2 = s1;

               s2.name = "Om";

        System.out.println("Student 1 Name: " + s1.name);
        System.out.println("Student 2 Name: " + s2.name);
    }
}
