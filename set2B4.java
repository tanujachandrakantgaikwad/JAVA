//Define a class MyNumber having one private integer data member. Write a default constructor to initialize it to 0 //and another constructor to initialize it to a value. Write methods isNegative, isPositive. Use command line argument to //pass a value to the object and perform the above tests. 
class MyNumber 
{
    private int num;

    MyNumber()
 {
        num = 0;
    }
    MyNumber(int n) 
  {
        num = n;
    }

    boolean isPositive() 
 {
        return num > 0;
    }
    boolean isNegative()
 {
        return num < 0;
    }

    public static void main(String[] args) 
{
        int value = Integer.parseInt(args[0]);  
        MyNumber obj = new MyNumber(value);

        if (obj.isPositive())
            System.out.println(value + " is Positive");
        else if (obj.isNegative())
            System.out.println(value + " is Negative");
        else
            System.out.println(value + " is Zero");
    }
}
