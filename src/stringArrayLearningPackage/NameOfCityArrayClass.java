package stringArrayLearningPackage;

import java.util.Scanner;

public class NameOfCityArrayClass {
	String[] nameOfCity = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "Kitchener" };
	String stringToExtract = "100 queen street,Toronto,M5V 3E3";
	Scanner sc = new Scanner(System.in);

	boolean searchCityNameInArray() {
		boolean isCityPresent = false;
		System.out.println("Enter the name of city to search:");
		String stringToBeChecked = sc.next();
		for (int i = 0; i < nameOfCity.length; i++) {
			if (nameOfCity[i].equals(stringToBeChecked)) {
				isCityPresent = true;
			}
		}
		return isCityPresent;
	}

	void getCityEndingWithTon() {
		System.out.println("Cities enging with ton is:");
		for (int i = 0; i < nameOfCity.length; i++) {
			if (nameOfCity[i].contains("ton")) {
				System.out.println(nameOfCity[i]);
			}
		}
	}

	void changeCityContainsTonWithFun() {
		String cityWithTon = null;
		String cityWithFun = null;
		System.out.println("City Name with ton is replaced with fun is");
		for (int i = 0; i < nameOfCity.length; i++) {
			if (nameOfCity[i].contains("ton")) {
				cityWithTon = nameOfCity[i];
				for (int j = 0; j < cityWithTon.length() - 2; j++) {
					if (cityWithTon.charAt(j) == 't' && cityWithTon.charAt(j + 1) == 'o'
							&& cityWithTon.charAt(j + 2) == 'n') {
						String cityNameWithoutTon = cityWithTon.substring(0, j);
						cityWithFun = cityNameWithoutTon + "fun";
						cityWithTon = cityWithFun + cityWithTon.substring(j + 3);
					}

				}
				System.out.println(cityWithTon);
			}

		}

	}

	void divideStringToVariables() {
		int index = 0;
		int count = 0;
		for (int i = 0; i < stringToExtract.length(); i++) {
			if (stringToExtract.charAt(i) == ',' || i == stringToExtract.length() - 1) {
				String extractedString = stringToExtract.substring(index, i);
				index = i + 1;
				count++;
				switch (count) {
				case 1:
					String stringAddress = extractedString;
					System.out.println(stringAddress);
					break;
				case 2:
					String stringCity = extractedString;
					System.out.println(stringCity);
					break;
				case 3:
					String stringPostalCode = stringToExtract.substring(i);
					String stringZip=extractedString + stringPostalCode;
					System.out.println(stringZip);
					break;
				default:
					break;
				}
			}
		}

	}
}
