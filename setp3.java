//3)Write a Java program to accept a number from command prompt and generate multiplication table of a number. 
class MultiplicationTable
 {
    public static void main(String[] args) 
      {
               if (args.length == 0)
           {
                   return;
          }
             int num = Integer.parseInt(args[0]);
        System.out.println("Multiplication Table ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
