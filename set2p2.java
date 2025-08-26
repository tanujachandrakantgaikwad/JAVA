//Write a Java program to keep the count of object created of a class. Display the count 
//each time when the object is created. 
class Student
 {
    static int count = 0; 

    Student()
 {
        count++; 
        System.out.println(" Total objects = " + count);
    }
    public static void main(String[] args)
 {
          Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
    }
}
