import java.util.*;

class InvalidAgeException extends Exception {
   InvalidAgeException(String message) {
      super(message);
   }
}


public class CustomException {
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int age = input.nextInt();
      try {
         if (age < 18) {
            throw new InvalidAgeException("Exception: Not eligible to vote");
         } else {
            System.out.println("Eligible to vote");
         }
      } 
      catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
      }
      

      input.close();
   }  
}
