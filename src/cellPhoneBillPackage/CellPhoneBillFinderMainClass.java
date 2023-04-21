package cellPhoneBillPackage;

public class CellPhoneBillFinderMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhoneBillFinderClass cellPhone = new CellPhoneBillFinderClass();
		System.out.println("Please enter the Brand that you want to choose from:");
		String userSelectedMobileBrand = cellPhone.getCellPhoneBrand();
		switch (userSelectedMobileBrand) {
		case "samsung":
			System.out.println("Please enter the model that you want to buy from below");
			String userSelectedMobileModel = cellPhone.getSamsungModelNameFromUser();
			System.out.println("Please select the plan that you want to opt for:");
			String userSelectedMobilePlan = cellPhone.getCellPhonePlanFromUser();
			System.out.println(
					"You have Selected " + userSelectedMobileModel + " with " + userSelectedMobilePlan + " Plan");
			float mobilePrice = cellPhone.getSamsungMobilePrice(userSelectedMobileModel);
			System.out.println("Your Phone Tab will be:" + mobilePrice);
			float mobilePlanPrice = cellPhone.getMonthlyMobilePrice(userSelectedMobilePlan);
			System.out.println("Your Monthly Plan will be:" + mobilePlanPrice);
			float totalMonthlyAmount = cellPhone.getMonthlyPriceIncludingPlan(mobilePrice, mobilePlanPrice);
			System.out.println("Total Monthly Amount:" + totalMonthlyAmount);
			break;
		case "apple":
			System.out.println("Please enter the model that you want to buy from below");
			String customerSelectedMobileModel = cellPhone.getAppleModelNameFromUser();
			System.out.println("Please select the plan that you want to opt for:");
			String customerSelectedMobilePlan = cellPhone.getCellPhonePlanFromUser();
			System.out.println("You have Selected " + customerSelectedMobileModel + " with " + customerSelectedMobilePlan
					+ " Plan");
			float appleMobilePrice = cellPhone.getAppleMobilePrice(customerSelectedMobileModel);
			System.out.println("Your Phone Tab will be:" + appleMobilePrice);
			float appleMobilePlanPrice = cellPhone.getMonthlyMobilePrice(customerSelectedMobilePlan);
			System.out.println("Your Monthly Plan will be:" + appleMobilePlanPrice);
			float appleTotalMonthlyAmount = cellPhone.getMonthlyPriceIncludingPlan(appleMobilePrice,
					appleMobilePlanPrice);
			System.out.println("Total Monthly Amount:" + appleTotalMonthlyAmount);
			break;
		default:
			System.out.println("Invalid Brand");
			break;
		}
	}

}
