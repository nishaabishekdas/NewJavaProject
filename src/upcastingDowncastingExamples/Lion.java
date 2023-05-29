package upcastingDowncastingExamples;

public class Lion extends Mammal {
	public void makesSound() {
		System.out.println("Lion roars");
	}

	@Override
	public void drink() {
		System.out.println("Lion drinking water");
	}

	public void eat(Animal animal) {
		if (animal == null) {
			animal = new Animal();
		}
		System.out.println("Eat something");
	}
}
