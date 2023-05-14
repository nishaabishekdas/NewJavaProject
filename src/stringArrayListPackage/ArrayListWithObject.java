package stringArrayListPackage;

//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListWithObject {
	Scanner sc = new Scanner(System.in);

	public void findElementInArrayList(List<EmployeeAccount> employeeArrayList) {
		System.out.println("Enter name to find in arraylist");
		String enteredName = sc.next();
		for (EmployeeAccount employee : employeeArrayList) {
			if (enteredName.equals(employee.getEmployeeName())) {
				System.out.println(enteredName + " found in the arraylist");
				break;
			}
		}
		printEmployeeArrayList(employeeArrayList);
	}

	public void removeElementInArrayList(List<EmployeeAccount> employeeArrayList) {
		System.out.println("Enter name to remove from arraylist");
		String enteredName = sc.next();
		for (EmployeeAccount employee : employeeArrayList) {
			if (enteredName.equals(employee.getEmployeeName())) {
				employeeArrayList.remove(employee);
				System.out.println(enteredName + " removed from list");
				break;
			}
		}
		printEmployeeArrayList(employeeArrayList);
	}

	public void setElementInArrayList(List<EmployeeAccount> employeeArrayList, EmployeeAccount tom) {
		employeeArrayList.set(3, tom);
		printEmployeeArrayList(employeeArrayList);
	}

	public void findIndexAndSetElement(List<EmployeeAccount> employeeArrayList, EmployeeAccount tom) {
		System.out.println("Enter name to replace from arraylist");
		String enteredName = sc.next();
		for (EmployeeAccount employee : employeeArrayList) {
			if (enteredName.equals(employee.getEmployeeName())) {
				int indexOfEmployee = employeeArrayList.indexOf(employee);
				employeeArrayList.set(indexOfEmployee, tom);
				break;
			}
		}
		printEmployeeArrayList(employeeArrayList);
	}

	public void printEmployeeArrayList(List<EmployeeAccount> employeeArrayList) {
		for (EmployeeAccount employeeDetails : employeeArrayList) {
			System.out.println(employeeDetails.getEmployeeName());
		}
	}
}
