package stringArrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMainClass {

	public static void main(String[] args) {

		// Operation performed on String
		ArrayListClass arrayListObj = new ArrayListClass();
		arrayListObj.populateArrayList();
		arrayListObj.findElementInArrayList();
		arrayListObj.removeElementInArrayList();
		arrayListObj.setElementInArrayList();
		arrayListObj.findIndexAndSetElementFromArrayList();
		// Operation performed on Object
		EmployeeAccount nisha = new EmployeeAccount(1, "Nisha", "Tester", 85000, "QA");
		EmployeeAccount neethu = new EmployeeAccount(2, "Neethu", "FA", 88000, "Finance");
		EmployeeAccount divya = new EmployeeAccount(3, "Divya", "TC", 83000, "Accounts");
		EmployeeAccount tom = new EmployeeAccount(7, "Tom", "Support", 70000, "ProductionSupport");
		EmployeeAccount vipin = new EmployeeAccount(4, "Vipin", "FA", 90000, "Finance");
		EmployeeAccount abishek = new EmployeeAccount(5, "Abishek", "Devloper", 85000, "Devlopment");
		EmployeeAccount adarsh = new EmployeeAccount(6, "Adarsh", "TC", 80000, "Accounts");
		ArrayListWithObject employeeArrayListObject = new ArrayListWithObject();
		List<EmployeeAccount> employeeArrayList = new ArrayList<EmployeeAccount>(
				Arrays.asList(nisha, neethu, divya, vipin, abishek, adarsh));
		employeeArrayListObject.findElementInArrayList(employeeArrayList);
		employeeArrayListObject.removeElementInArrayList(employeeArrayList);
		employeeArrayListObject.setElementInArrayList(employeeArrayList, tom);
		employeeArrayListObject.findIndexAndSetElement(employeeArrayList, tom);
		
		//Operation Performed on integer
		ArrayListWithInteger integerObj=new ArrayListWithInteger();
		integerObj.searchElementInArrayList();
	}

}