package stringArrayLearningPackage;

public class NameOfCityArrayMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameOfCityArrayClass city = new NameOfCityArrayClass();
		boolean isCityPresent = city.searchCityNameInArray();
		if (isCityPresent) {
			System.out.println("City name present in the array");
		} else {
			System.out.println("City name not present in the array");
		}
		city.getCityEndingWithTon();
		city.changeCityContainsTonWithFun();
		city.divideStringToVariables();
	}

}
