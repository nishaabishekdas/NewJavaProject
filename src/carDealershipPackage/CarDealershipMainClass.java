package carDealershipPackage;

public class CarDealershipMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car toyota = new Car("Toyota", "Blue", 5, true);
		Car honda = new Car("Honda", "White", 6, false);
		Car Chevrolet = new Car("Chevrolet", "Black", 5, true);
		Car nissan = new Car("Nissan", "Red", 6, true);

		Car[] car = { toyota, honda, Chevrolet, nissan };
		Dealership ds = new Dealership();
		ds.getCarInStock(car);
		Car whiteCar = ds.getWhiteCars();
		System.out.println("Name of white Car in Stock is: " + whiteCar.getCarName());
		ds.getCarInStock();
	}

}
