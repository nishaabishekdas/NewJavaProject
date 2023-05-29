package practicalInterviewQuestionsPackage;

public class PrimeNumberBetweenIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstInterval=10;
		int secondInterval=50;
		boolean isPrime=false;
		for(int i=firstInterval;i<=secondInterval;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}else {
					isPrime=true;
				}
			}if(isPrime) {
			System.out.println(i);
			}
		}
	}

}
