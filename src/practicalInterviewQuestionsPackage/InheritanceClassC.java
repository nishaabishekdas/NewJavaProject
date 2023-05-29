package practicalInterviewQuestionsPackage;

public class InheritanceClassC extends InheritanceClassB implements ClassD, ClassE {
	public void classCMethod() {
		System.out.println("ClassC Method");
	}

	public void classCModelTesting() {
		System.out.println("ClassC Testing");
	}

	@Override
	public void classAMethod() {
		System.out.println("ClassA Method in Class C");
	}

	@Override
	public void classBModelTesting() {
		System.out.println("ClassB Testing in Class C");
	}

	@Override
	public void overloadingConcept() {
		System.out.println("Method Overloading of Class A in Class C");
	}

	@Override
	public void generalRuleInterfaceClassD() {
		// TODO Auto-generated method stub
		System.out.println("Method in interface Class D");
	}

	@Override
	public void abstractMethodClassD() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method in interface class D");
	}

	@Override
	public void methodOfClassEInterface() {
		// TODO Auto-generated method stub
		System.out.println("Method of Interface ClassE in Class C");
	}
	
	@Override
	public int overloadingConcept(String name, int number) {
		System.out.println("Overridden Method of Class A in Class C");
		return number;
	}
	
	
}
