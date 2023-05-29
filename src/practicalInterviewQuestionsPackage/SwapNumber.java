package practicalInterviewQuestionsPackage;

public class SwapNumber {
	public int num1 = 3;
	public int num2 = 6;

	public void swapNumberWithoutThirdVariable() {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("num1:" + num1 + "num2:" + num2);
	}
}
