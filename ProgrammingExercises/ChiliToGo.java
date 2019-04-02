import java.util.Scanner;

public class ChiliToGo
{
   public static void main(String[] args)
   {
      final int ADULT_MEAL_PRICE = 7;
      final int CHILD_MEAL_PRICE = 4;

      Scanner inputAdultMeals = new Scanner(System.in);
      System.out.println("Enter your value for the number of Adult Meals");
      int numOfAdultMeals = inputAdultMeals.nextInt();

      Scanner inputChildMeals = new Scanner(System.in);
      System.out.println("Enter your value for the number of Child Meals");
      int numOfChildMeals = inputChildMeals.nextInt();

      int total_no_of_meals = numOfAdultMeals + numOfChildMeals;

      int priceOfAdultMeals = numOfAdultMeals * ADULT_MEAL_PRICE;
      int priceOfChildMeals = numOfChildMeals * CHILD_MEAL_PRICE;

      int totalPrice = priceOfAdultMeals + priceOfChildMeals;

      System.out.println("The price for " + numOfAdultMeals + " Adult meals is $" + priceOfAdultMeals);
      System.out.println("The price for " + numOfChildMeals + " Adult meals is $" + priceOfChildMeals);
      System.out.println("The total price for all meals is $" + totalPrice);
   }
}
