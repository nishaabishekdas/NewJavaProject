package practicalInterviewQuestionsPackage;

public class FindingVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="u";
	    if(str.matches(".*[a,e,i,o,u].*")) {
	    	System.out.println("vowels");
	    }else {
	    	System.out.println("Consonant");
	    }
		
	}

}
