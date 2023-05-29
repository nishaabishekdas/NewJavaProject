package javaInterview;

import java.util.ArrayList;

public class StringArrayList {
	public String enteredString = "Welcome,to,the,most,important,interview,of,the,Course";
	ArrayList<String> seperatedString=new ArrayList<String>();
	public void getArrayListFromString() {
		String[] splitString=enteredString.split(",");
		for(String s:splitString) {
			seperatedString.add(s);
		}
		System.out.println(seperatedString);
	}
}
