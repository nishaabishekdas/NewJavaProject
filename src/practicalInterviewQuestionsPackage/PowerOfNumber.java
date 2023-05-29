package practicalInterviewQuestionsPackage;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exponent=2;
		int base=5;
		int result=1;
		for(int i=exponent;i>0;i--) {
			result*=base;
		}
		System.out.println(result);
		
	}

}
