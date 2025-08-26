//Write a Java program to convert integer primitive data. (use toString()). 
 class Demo
{
    public static void main(String[] args) 
{
        int num = 123;  
        String str = Integer.toString(num);

        System.out.println("Integer value: " + num);
        System.out.println("Converted String value: " + str);

        System.out.println("Length of String: " + str.length());
    }
}
