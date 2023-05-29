package practicalInterviewQuestionsPackage;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contentOfString="NishaMohandas";
		String inputString=" ";
		int count=0;
		char[] charArray=contentOfString.toCharArray();
		for(char s:charArray) {
			inputString+=s;
			count++;
		}
		System.out.println("The length of String"+inputString+ " is "+count);
		
	}
	
	
	
}
