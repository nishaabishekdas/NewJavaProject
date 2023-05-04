package carDealershipPackage;

public class Dealership {
	private Car[] car = new Car[4];

	public void getCarInStock(Car[] car) {
		for (int i = 0; i < car.length; i++) {
			if (this.car[i] == null) {
				this.car[i] = car[i];				
			}
		}
	}
	
	public void getCarInStock() {
		for(int i=0;i<car.length;i++) {
			if(car[i].getCarSeat()>5) {
				System.out.println(car[i].getCarName());				
			}
		}
	}

	public Car getWhiteCars() {
		Car whiteCar = new Car();
		for (int i = 0; i < car.length; i++) {
			if (car[i].getCarColour().equals("White")) {
				whiteCar = car[i];
				break;
			}
		}
		return whiteCar;
	}
}
