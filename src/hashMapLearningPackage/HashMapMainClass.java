package hashMapLearningPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAccountClass nisha = new EmployeeAccountClass(1, "Nisha", "Tester", 85000, "QA");
		EmployeeAccountClass neethu = new EmployeeAccountClass(2, "Neethu", "FA", 88000, "Finance");
		EmployeeAccountClass divya = new EmployeeAccountClass(3, "Divya", "TC", 83000, "Accounts");
		EmployeeAccountClass vipin = new EmployeeAccountClass(4, "Vipin", "FA", 90000, "Finance");
		EmployeeAccountClass abishek = new EmployeeAccountClass(5, "Abishek", "Devloper", 85000, "Devlopment");
		EmployeeAccountClass adarsh = new EmployeeAccountClass(6, "Adarsh", "TC", 80000, "Accounts");
		List<EmployeeAccountClass> finance = new ArrayList<EmployeeAccountClass>(Arrays.asList(neethu, vipin));
		List<EmployeeAccountClass> account = new ArrayList<EmployeeAccountClass>(Arrays.asList(divya, adarsh));
		List<EmployeeAccountClass> qa = new ArrayList<EmployeeAccountClass>(Arrays.asList(nisha));
		List<EmployeeAccountClass> dev = new ArrayList<EmployeeAccountClass>(Arrays.asList(abishek));
		HashMap<Integer, List<EmployeeAccountClass>> employeeMap = new HashMap<Integer, List<EmployeeAccountClass>>();
		employeeMap.put(111, finance);
		employeeMap.put(555, account);
		employeeMap.put(672, qa);
		employeeMap.put(444, dev);
		for (Map.Entry<Integer, List<EmployeeAccountClass>> departments : employeeMap.entrySet()) {
			System.out.print("\n" + departments.getKey() + ",");
			List<EmployeeAccountClass> arrayListDepartment = new ArrayList<EmployeeAccountClass>(
					departments.getValue());
			for (EmployeeAccountClass deptObject : arrayListDepartment) {
				System.out.print(deptObject.getEmployeeName() + " ");
			}
		}
	}

}
