public class NauticalMiles
{
   public static void main(String[] args)
   {
      double kilometers;
      double miles;
      final double KILOMETERS_IN_NAUTICAL = 1.852;
      final double MILES_IN_NAUTICAL = 1.150779;
      double nautical_miles = 100;
      kilometers = KILOMETERS_IN_NAUTICAL * nautical_miles;
      miles = MILES_IN_NAUTICAL * nautical_miles;
      System.out.println("A nautical mile is " + kilometers + " kilometers or " + miles + " miles.");
   }
}
