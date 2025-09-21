// Write a java program to validate PAN number and Mobile Number. If it is invalid then 
//throw user defined Exception “Invalid Data”, otherwise display it.      
import java.util.*;
class InvalidDataException extends Exception
 {
    InvalidDataException(String msg)
 {
        super(msg);
    }
}

class SimpleValidate
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter PAN number: ");
            String pan = sc.nextLine().toUpperCase();

            System.out.print("Enter Mobile number: ");
            String mobile = sc.nextLine();

            if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) 
          {
                throw new InvalidDataException("Invalid PAN Number");
            }

            if (!mobile.matches("[6-9][0-9]{9}"))
          {
                throw new InvalidDataException("Invalid Mobile Number");
            }

            System.out.println("PAN: " + pan);
            System.out.println("Mobile: " + mobile);

        } catch (InvalidDataException e)
          {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
