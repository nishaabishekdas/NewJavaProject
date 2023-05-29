package practicalInterviewQuestionsPackage;

import java.util.Scanner;

public class InheritanceMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceClassA obj = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Class you want to use?");
		String enteredInput = sc.next().toLowerCase();
		switch (enteredInput) {
		case "b":
			obj = new InheritanceClassB();
			InheritanceClassB objB=(InheritanceClassB) obj;
			obj.overloadingConcept(5);
			obj.overloadingConcept("abishek", 3);
			objB.classBModelTesting();
			InheritanceClassB.methodStaticConcept();
			break;
		case "c":
			obj = new InheritanceClassC();
			InheritanceClassC objC=(InheritanceClassC) obj;
			obj.overloadingConcept("nisha", 5);
			obj.overloadingConcept();
			objC.overloadingConcept("ayaan",50);
			objC.abstractMethodClassD();
			objC.generalRuleInterfaceClassD();
			objC.methodOfClassEInterface();
			ClassD.methodOfClassD();
			break;
		default:
			System.out.println("Default");
		}
		sc.close();
	}

}
