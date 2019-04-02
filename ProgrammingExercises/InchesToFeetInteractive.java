import java.util.Scanner; // Import Scanner

public class InchesToFeetInteractive
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your value for inches");

      int inches = input.nextInt();
      int feet;
      final int INCHES_IN_FOOT = 12;
      int additionalInches;
      feet = inches / INCHES_IN_FOOT;
      additionalInches = inches % INCHES_IN_FOOT;
      System.out.println(inches + " inches = " + feet + " feet " + additionalInches + " inches");
   }
}
