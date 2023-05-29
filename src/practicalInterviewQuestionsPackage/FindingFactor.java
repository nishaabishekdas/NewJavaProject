package practicalInterviewQuestionsPackage;

public class FindingFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=68;
		System.out.println("Factors of "+number+" is:");
		for(int i=1;i<=number;i++){
			if(number%i==0) {
				System.out.println(i);
			}
		}
	}

}
