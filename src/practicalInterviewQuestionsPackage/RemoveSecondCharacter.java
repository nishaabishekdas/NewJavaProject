package practicalInterviewQuestionsPackage;

public class RemoveSecondCharacter {

	public static void main(String[] args) {
		String enteredString = "NishaMohandas";
		String newString=" ";
		for(int i=0;i<enteredString.length();i=i+2) {
			newString+=enteredString.charAt(i);
		}
		System.out.println("New String is"+newString);
	}

}
