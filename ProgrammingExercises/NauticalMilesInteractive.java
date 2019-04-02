import java.util.Scanner; // Import Scanner

public class NauticalMilesInteractive
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your value for the number of nautical miles");

      double kilometers;
      double miles;
      final double KILOMETERS_IN_NAUTICAL = 1.852;
      final double MILES_IN_NAUTICAL = 1.150779;
      double nautical_miles = input.nextInt();
      kilometers = KILOMETERS_IN_NAUTICAL * nautical_miles;
      miles = MILES_IN_NAUTICAL * nautical_miles;
      System.out.println("A nautical mile is " + kilometers + " kilometers or " + miles + " miles.");
   }
}
