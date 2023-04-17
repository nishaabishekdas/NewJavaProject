package cellPhoneBillPackage;

public class CellPhoneBillFinderMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhoneBillFinderClass cellPhone = new CellPhoneBillFinderClass();
		System.out.println("Please enter the Brand that you want to choose from:");
		String userSelectedMobileBrand = cellPhone.cellPhoneBrandSelectionMethod();
		switch (userSelectedMobileBrand) {
		case "samsung":
			System.out.println("Please enter the model that you want to buy from below");
			String userSelectedMobileModel = cellPhone.samsungModelSelectionMethod();
			System.out.println("Please select the plan that you want to opt for:");
			String userSelectedMobilePlan = cellPhone.cellPhonePlanSelectionMethod();
			System.out.println(
					"You have Selected " + userSelectedMobileModel + " with " + userSelectedMobilePlan + " Plan");
			float mobilePrice = cellPhone.samsungMobilePriceFindingMethod(userSelectedMobileModel);
			System.out.println("Your Phone Tab will be:" + mobilePrice);
			float mobilePlanPrice = cellPhone.monthlyPlanPriceFindingMethod(userSelectedMobilePlan);
			System.out.println("Your Monthly Plan will be:" + mobilePlanPrice);
			float totalMonthlyAmount = cellPhone.totalMonthlyAmountFinderMethod(mobilePrice, mobilePlanPrice);
			System.out.println("Total Monthly Amount:" + totalMonthlyAmount);
			break;
		case "apple":
			System.out.println("Please enter the model that you want to buy from below");
			String customerSelectedMobileModel = cellPhone.appleModelSelectionMethod();
			System.out.println("Please select the plan that you want to opt for:");
			String customerSelectedMobilePlan = cellPhone.cellPhonePlanSelectionMethod();
			System.out.println("You have Selected " + customerSelectedMobileModel + " with " + customerSelectedMobilePlan
					+ " Plan");
			float appleMobilePrice = cellPhone.appleMobilePriceFindingMethod(customerSelectedMobileModel);
			System.out.println("Your Phone Tab will be:" + appleMobilePrice);
			float appleMobilePlanPrice = cellPhone.monthlyPlanPriceFindingMethod(customerSelectedMobilePlan);
			System.out.println("Your Monthly Plan will be:" + appleMobilePlanPrice);
			float appleTotalMonthlyAmount = cellPhone.totalMonthlyAmountFinderMethod(appleMobilePrice,
					appleMobilePlanPrice);
			System.out.println("Total Monthly Amount:" + appleTotalMonthlyAmount);
			break;
		default:
			System.out.println("Invalid Brand");
			break;
		}
	}

}
