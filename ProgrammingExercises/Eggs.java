import java.util.Scanner;

public class Eggs
{
   public static void main(String[] args)
   {
      final int DOZEN = 12;
      final double DOZEN_COST = 3.25;
      final double INDIVIDUAL_COST = 0.45;

      Scanner inputDozenEggs = new Scanner(System.in);
      System.out.println("Enter your value for the number of dozen eggs");
      int numOfDozenEggs = inputDozenEggs.nextInt();

      Scanner inputIndividualEggs = new Scanner(System.in);
      System.out.println("Enter your value for the number of individual eggs");
      int numOfIndividualEggs = inputIndividualEggs.nextInt();

      int dozen = numOfDozenEggs * DOZEN;
      int total_no_of_eggs = dozen + numOfIndividualEggs;

      double dozenPrice = numOfDozenEggs * DOZEN_COST;
      double loosePrice = numOfIndividualEggs * INDIVIDUAL_COST;

      double totalPrice = dozenPrice + loosePrice;

      System.out.println("You ordered " + total_no_of_eggs + " eggs. That's " + numOfDozenEggs + " dozen at $3.25 per dozen and " + numOfIndividualEggs + " loose eggs at 45 cents each for a total of $" + totalPrice);
   }
}
