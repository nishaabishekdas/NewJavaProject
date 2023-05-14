package stringArrayListPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
	ArrayList<String> stringArrayList = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

	void populateArrayList() {
		stringArrayList.add("Nisha");
		stringArrayList.add("Ayaan");
		stringArrayList.add("Abishek");
		stringArrayList.add("Sheeba");
		System.out.println(stringArrayList);
	}

	void findElementInArrayList() {
		System.out.println("Enter the name to found in arraylist");
		String enteredName = sc.next();
		for (int i = 0; i < stringArrayList.size(); i++) {
			if (enteredName.equals(stringArrayList.get(i))) {
				System.out.println("Name " + enteredName + " found in the arraylist");
				break;
			}
		}
	}

	void removeElementInArrayList() {
		System.out.println("Enter the name to remove in arraylist");
		String enteredName = sc.next();
		for (int i = 0; i < stringArrayList.size(); i++) {
			if (enteredName.equals(stringArrayList.get(i))) {
				stringArrayList.remove(i);
				break;
			}
		}
		System.out.println(stringArrayList);
	}

	void setElementInArrayList() {
		System.out.println("Enter the name to set in arraylist");
		String enteredName = sc.next();
		stringArrayList.set(3, enteredName);
		System.out.println(stringArrayList);
	}

	void findIndexAndSetElementFromArrayList() {
		System.out.println("Enter the name to replace in arraylist");
		String enteredName = sc.next();
		int indexOfElement = stringArrayList.indexOf(enteredName);
		if (indexOfElement == -1) {
			System.out.println("Name not found");
		} else {
			stringArrayList.set(indexOfElement, "Neethu");
			System.out.println(stringArrayList);
		}
	}

	void findIndexAndRemoveElementFromArrayList() {
		System.out.println("Enter the name to remove in arraylist");
		String enteredName = sc.next();
		int indexOfElement = stringArrayList.indexOf(enteredName);
		if (indexOfElement == -1) {
			System.out.println("Name not found");
		} else {
			stringArrayList.remove(indexOfElement);
			System.out.println(stringArrayList);
		}
	}
}
