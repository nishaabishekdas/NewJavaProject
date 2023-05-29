package practicalInterviewQuestionsPackage;

public abstract class InheritanceClassA {
	public int number = 1;
	public static int statVar=9;

	public void classAMethod() {
		System.out.println("ClassA Method");
	}

	public void classAModelTesting() {
		System.out.println("ClassA Testing");
	}

	public abstract void generalRuleA();

	public void overloadingConcept() {
		System.out.println("Method Overloading of Class A");
	}

	public void overloadingConcept(int number) {
		System.out.println("Method Overloading of Class A with int" + number);
	}

	public void overloadingConcept(String name) {
		System.out.println("Method Overloading of Class A with String" + name);
	}

	public int overloadingConcept(String name, int number) {
		System.out.println("Method Overloading of Class A with String" + name);
		return number;
	}
	
}
