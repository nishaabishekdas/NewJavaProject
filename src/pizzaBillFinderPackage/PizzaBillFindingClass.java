package pizzaBillFinderPackage;

import java.util.Scanner;

public class PizzaBillFindingClass {
	int extraCheese = 1;
	String orderItem = "Cheese Pizza";
	String[] sizeOfPizza = { "small", "medium", "large" };
	int[] pepperoniToppingsPrice = { 2, 3, 3 };
	int[] priceOfPizza = { 15, 20, 25 };
	Scanner sc = new Scanner(System.in);

	String itemNeeded() {
		System.out.println("Enter the item you want to order");
		String itemOrdered = sc.next();
		return itemOrdered;
	}

	String sizeOfPizzaUserWants() {
		System.out.println("Enter the size of Pizza");
		String pizzaSize = sc.next();
		return pizzaSize;
	}

	Boolean pepporoniToppings() {
		boolean toppingsNeeded=false;
		System.out.println("Do you need pepporoni Toppings?");
		toppingsNeeded = sc.nextBoolean();
		return toppingsNeeded;
	}

	Boolean extraCheeseNeeded() {
		System.out.println("Do you need extra Cheese?");
		boolean extraCheeseForCustomer = sc.nextBoolean();
		return extraCheeseForCustomer;
	}

	int cheesePizzaPrice(String sizeOfPizzaOrdered) {
		String userOrderedPizzaSize = sizeOfPizzaOrdered;
		int priceofPizzaOrdered = 0;
		for (int i = 0; i < sizeOfPizza.length; i++) {
			if (sizeOfPizza[i].equals(userOrderedPizzaSize)) {
				priceofPizzaOrdered = priceOfPizza[i];
			}
		}
		return priceofPizzaOrdered;
	}

	int pepporoniPriceAsPerSize(String sizeOfPizzaOrdered) {
		String userOrderedPizzaSize = sizeOfPizzaOrdered;
		int priceofPepporoniToppingsOrdered = 0;
		for (int i = 0; i < sizeOfPizza.length; i++) {
			if (sizeOfPizza[i].equals(userOrderedPizzaSize)) {
				priceofPepporoniToppingsOrdered = pepperoniToppingsPrice[i];
			}
		}
		return priceofPepporoniToppingsOrdered;
	}

	float priceOfPizzaWithTopping(int priceofPizzaOrdered, int priceofPepporoniToppingsOrdered) {
		int pizzaPrice = priceofPizzaOrdered;
		int toppingPrice = priceofPepporoniToppingsOrdered;
		float finalBill = pizzaPrice + toppingPrice;
		return finalBill;
	}

	float priceOfPizzaWithExtraCheese(int priceofPizzaOrdered) {
		int pizzaPrice = priceofPizzaOrdered;
		float finalBill = pizzaPrice + extraCheese;
		return finalBill;
	}

	float priceOfPizzaWithToppingAndCheese(int priceofPizzaOrdered, int priceofPepporoniToppingsOrdered) {
		int pizzaPrice = priceofPizzaOrdered;
		int toppingPrice = priceofPepporoniToppingsOrdered;
		float finalBill = pizzaPrice + toppingPrice + extraCheese;
		return finalBill;
	}
}
