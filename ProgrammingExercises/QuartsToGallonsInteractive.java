import java.util.Scanner; // Import Scanner

public class QuartsToGallonsInteractive
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your value for the number of quarts");

      int quarts = input.nextInt();
      int gallons;
      final int QUARTS_IN_GALLON = 4;
      int plusQuarts;
      gallons = quarts / QUARTS_IN_GALLON;
      plusQuarts = quarts % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quarts + " quarts requires " + gallons + " gallons plus " + plusQuarts + " quarts.");
   }
}
