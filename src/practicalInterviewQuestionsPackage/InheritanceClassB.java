package practicalInterviewQuestionsPackage;

public class InheritanceClassB extends InheritanceClassA {
	public void classBMethod() {
		System.out.println("ClassB Method");
	}

	public void classBModelTesting() {
		System.out.println("ClassB Testing");
	}

	public void generalRuleA() {
		System.out.println("generalRuleA Method in Subclass B");
	}

	@Override
	public void overloadingConcept(int number) {
		System.out.println("Overridden Method of Class A in Class B");
	}

	@Override
	public int overloadingConcept(String name, int number) {
		System.out.println("Overloaded and Overridden Method(A) of Class B");
		return number;
	}
	public static void methodStaticConcept() {
		System.out.println("Static Method of ClassB");
	}
}
