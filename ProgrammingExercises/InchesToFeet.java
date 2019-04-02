public class InchesToFeet
{
   public static void main(String[] args)
   {
      int inches = 86;
      int feet;
      final int INCHES_IN_FOOT = 12;
      int additionalInches;
      feet = inches / INCHES_IN_FOOT;
      additionalInches = inches % INCHES_IN_FOOT;
      System.out.println(inches + " inches = " + feet + " feet " + additionalInches + " inches");
   }
}
