package practicalInterviewQuestionsPackage;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enteredNum=10;
		int factorial = 1;
		for(int i=enteredNum;i>0;i--) {
			factorial*=i;
		}
		System.out.println("factorial is: "+factorial);
	}

}
