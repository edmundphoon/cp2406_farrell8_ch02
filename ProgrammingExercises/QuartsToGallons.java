public class QuartsToGallons
{
   public static void main(String[] args)
   {
      int quarts = 18;
      int gallons;
      final int QUARTS_IN_GALLON = 4;
      int plusQuarts;
      gallons = quarts / QUARTS_IN_GALLON;
      plusQuarts = quarts % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quarts + " quarts requires " + gallons + " gallons plus " + plusQuarts + " quarts.");
   }
}
