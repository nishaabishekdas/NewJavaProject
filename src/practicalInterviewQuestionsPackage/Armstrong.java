package practicalInterviewQuestionsPackage;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amstrongNumber = 1634;
		int compareResult = amstrongNumber;
		int result = 0;
		int lengthOfNum = String.valueOf(amstrongNumber).length();
		while (amstrongNumber != 0) {
			int rem = amstrongNumber % 10;
			result += Math.pow(rem, lengthOfNum);
			amstrongNumber /= 10;
		}
		if (compareResult == result) {
			System.out.println("Armstrong");
		} else {
			System.out.println("not Armstrong");
		}
	}

}
