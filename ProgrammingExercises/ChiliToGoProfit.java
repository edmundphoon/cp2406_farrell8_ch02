import java.util.Scanner;

public class ChiliToGoProfit
{
   public static void main(String[] args)
   {
      final double ADULT_MEAL_PRICE = 7.0;
      final double CHILD_MEAL_PRICE = 4.0;
      final double ADULT_MEAL_COST = 4.35;
      final double CHILD_MEAL_COST = 3.10;

      Scanner inputAdultMeals = new Scanner(System.in);
      System.out.println("Enter your value for the number of Adult Meals");
      double numOfAdultMeals = inputAdultMeals.nextInt();

      Scanner inputChildMeals = new Scanner(System.in);
      System.out.println("Enter your value for the number of Child Meals");
      double numOfChildMeals = inputChildMeals.nextInt();

      double total_no_of_meals = numOfAdultMeals + numOfChildMeals;

      double priceOfAdultMeals = numOfAdultMeals * ADULT_MEAL_PRICE;
      double priceOfChildMeals = numOfChildMeals * CHILD_MEAL_PRICE;

      double profitOfAdultMeals = priceOfAdultMeals - (numOfAdultMeals * ADULT_MEAL_COST);
      double profitOfChildMeals = priceOfChildMeals - (numOfChildMeals * CHILD_MEAL_COST);
      double totalProfit = profitOfAdultMeals + profitOfChildMeals;

      System.out.println("The profit for " + numOfAdultMeals + " Adult meals is $" + profitOfAdultMeals);
      System.out.println("The profit for " + numOfChildMeals + " Adult meals is $" + profitOfChildMeals);
      System.out.println("The total profit for all meals is $" + totalProfit);
   }
}
