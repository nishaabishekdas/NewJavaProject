package practicalInterviewQuestionsPackage;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		int sequenceLimit=13;
		int sum=0;
		for(int i=0;i<sequenceLimit-2;i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(sum);
	}

}
