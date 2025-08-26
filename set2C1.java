//Define class Student(rno, name, mark1, mark2). Define Result class(total, percentage) inside the student class. //Accept the student details & display the mark sheet with rno, name, mark1, mark2, total, percentage. (Use inner class //concept) 
class Student 
{
    int rno;
    String name;
    int mark1, mark2;

    Student(int rno, String name, int mark1, int mark2) 
{
        this.rno = rno;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    class Result
 {
        int total;
        double percentage;
        Result()
    {
            total = mark1 + mark2;
            percentage = total / 2.0;
        }

        void display() {
            System.out.println("--- Mark Sheet ---");
            System.out.println("Roll No : " + rno);
            System.out.println("Name    : " + name);
            System.out.println("Mark1   : " + mark1);
            System.out.println("Mark2   : " + mark2);
            System.out.println("Total   : " + total);
            System.out.println("Percent : " + percentage + "%");
        }
    }

    public static void main(String[] args) 
{
        Student s = new Student(101, "tanuja", 80, 90);
        Student.Result res = s.new Result();
        res.display();
    }
}
