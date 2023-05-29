package practicalInterviewQuestionsPackage;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
	public int[] number=new int[5];
	public int swapNum;
	Scanner sc=new Scanner(System.in);
	public void populateArray() {
		System.out.println("Enter 5 random numbers");		
		for(int i=0;i<5;i++) {
			int enteredNum=sc.nextInt();
			number[i]=enteredNum;
		}
	}

	public void getLargestNumber() {
		for(int i=0;i<number.length;i++) {
			for(int j=i;j<number.length;j++) {
				if(number[i]<number[j]) {
					swapNum=number[i];
					number[i]=number[j];
					number[j]=swapNum;
				}
			}
		}
		System.out.println(Arrays.toString(number));
		System.out.println("The Largest Number is: "+number[0]);
	}
	
	
}
