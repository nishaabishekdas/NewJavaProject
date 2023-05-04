package learningCompositionPackage;

public class PersonDetailsMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetailsClass sucharitha = new PersonDetailsClass(1111111111, "Sucharitha", "RBC", 20000, true);
		PersonDetailsClass neelam = new PersonDetailsClass(222222222, "Neelam", "BMO", 40000, true);
		PersonDetailsClass jimna = new PersonDetailsClass(333333333, "Jimna", "RBC", 30000, false);
		PersonDetailsClass rojy = new PersonDetailsClass(444444444, "Rojy", "CIBC", 40000, true);
		PersonDetailsClass vinduja = new PersonDetailsClass(555555555, "vinduja", "Scotia Bank", 30000, false);
		PersonDetailsClass gopesh = new PersonDetailsClass(666666666, "Gopesh", "BMO", 60000, true);

		PersonDetailsClass[] person = { sucharitha, neelam, jimna, rojy, vinduja, gopesh };
		for (int i = 0; i < person.length; i++) {
			if (person[i].getMarriageStatus()) {
				System.out.println(person[i].getPersonName());
			}
		}
	}

}
