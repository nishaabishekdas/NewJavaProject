package stringArrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListWithInteger {
	Scanner sc=new Scanner(System.in);
	List<Integer> arrayListInteger=new ArrayList<Integer>(Arrays.asList(111,222,333,444,555,666,777));
	void searchElementInArrayList() {
		System.out.println("enter element to find in the list");
		int enteredNumber=sc.nextInt();
		for(int element:arrayListInteger) {
			if(enteredNumber==element) {
				System.out.println("Match found");
			}
		}
	}
}
