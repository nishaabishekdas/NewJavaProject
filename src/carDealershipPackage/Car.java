package carDealershipPackage;

public class Car {
	private String carName;
	private String carColour;
	private int carSeat;
	private boolean isRoofTopAvailable;

	public Car(String carName, String carColour, int carSeat, boolean isRoofTopAvailable) {
		super();
		this.carName = carName;
		this.carColour = carColour;
		this.carSeat = carSeat;
		this.isRoofTopAvailable = isRoofTopAvailable;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarName() {
		return carName;
	}

	public String getCarColour() {
		return carColour;
	}

	public int getCarSeat() {
		return carSeat;
	}

	public boolean getIsRoofTopAvailable() {
		return isRoofTopAvailable;
	}
}
