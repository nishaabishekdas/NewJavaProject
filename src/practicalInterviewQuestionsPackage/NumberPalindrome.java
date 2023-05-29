package practicalInterviewQuestionsPackage;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=321;
		int reverednum=number;
		int reverse=0;
		while(number!=0) {
			int reminder=number%10;
			reverse=reverse*10+reminder;
			number/=10;
		}
		System.out.println(reverse);
		if(reverednum==reverse) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
