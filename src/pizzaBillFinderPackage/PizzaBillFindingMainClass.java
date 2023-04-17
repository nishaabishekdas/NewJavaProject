package pizzaBillFinderPackage;

public class PizzaBillFindingMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaBillFindingClass bill = new PizzaBillFindingClass();
		String userOrderedItem = bill.itemNeeded();
		String sizeOfPizzaSelected = bill.sizeOfPizzaUserWants();
		boolean isToppings = bill.pepporoniToppings();
		boolean isExtraCheese = bill.extraCheeseNeeded();
		int pizzaPrice = bill.cheesePizzaPrice(sizeOfPizzaSelected);
		int toppingPrice = bill.pepporoniPriceAsPerSize(sizeOfPizzaSelected);
		if (isToppings && isExtraCheese && bill.orderItem.equals(userOrderedItem)) {
			float finalBillOfPizza = bill.priceOfPizzaWithToppingAndCheese(pizzaPrice, toppingPrice);
			System.out.println("Your final bill is:" + finalBillOfPizza);
		} else if (isToppings && bill.orderItem.equals(userOrderedItem)) {
			float finalBillOfPizzaWithTopping = bill.priceOfPizzaWithTopping(pizzaPrice, toppingPrice);
			System.out.println("Your final bill is:" + finalBillOfPizzaWithTopping);
		} else if (isExtraCheese && bill.orderItem.equals(userOrderedItem)) {
			float finalBillOfPizzaWithCheese = bill.priceOfPizzaWithExtraCheese(toppingPrice);
			System.out.println("Your final bill is:" + finalBillOfPizzaWithCheese);
		}
	}

}
