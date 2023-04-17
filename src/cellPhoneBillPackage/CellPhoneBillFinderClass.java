package cellPhoneBillPackage;

import java.util.Scanner;

public class CellPhoneBillFinderClass {
	String[] mobilePhoneBrand = { "samsung", "apple" };
	String[] samsungPhoneModels = { "s22", "s22+", "s22 ultra", "s22 fe" };
	float[] samsungPhonePrice = { 25, 35, 55, 20 };
	String[] applePhoneModels = { "iphone 14", "iphone 14 pro", "iphone 14 pro max", "iphone 14 mini" };
	float[] applePhonePrice = { 30, 40, 65, 25 };
	String[] commonPlanNames = { "rogers", "bell", "telus" };
	float[] commonPlanPrice = { 70, 80, 75 };
	Scanner sc = new Scanner(System.in);

	String cellPhoneBrandSelectionMethod() {
		String mobileBrand = null;
		for (int index = 0; index < mobilePhoneBrand.length; index++) {
			System.out.println(mobilePhoneBrand[index]);
		}
		mobileBrand = sc.nextLine();
		return mobileBrand;
	}

	String samsungModelSelectionMethod() {
		String mobileModel = null;

		for (int index = 0; index < samsungPhoneModels.length; index++) {
			System.out.println(samsungPhoneModels[index]);
		}
		mobileModel = sc.nextLine();
		return mobileModel;
	}

	String appleModelSelectionMethod() {
		String mobileModel = null;

		for (int index = 0; index < applePhoneModels.length; index++) {
			System.out.println(applePhoneModels[index]);
		}
		mobileModel = sc.nextLine();
		return mobileModel;
	}

	String cellPhonePlanSelectionMethod() {
		String mobilePlan = null;
		for (int index = 0; index < commonPlanNames.length; index++) {
			System.out.println(commonPlanNames[index]);
		}
		mobilePlan = sc.nextLine();
		return mobilePlan;
	}

	float samsungMobilePriceFindingMethod(String userSelectedMobileModel) {
		String mobileModel = userSelectedMobileModel;
		float mobilePrice = 0;
		for (int i = 0; i < samsungPhoneModels.length; i++) {
			if (samsungPhoneModels[i].equals(mobileModel)) {
				mobilePrice = samsungPhonePrice[i];
			}
		}
		return mobilePrice;
	}

	float appleMobilePriceFindingMethod(String userSelectedMobileModel) {
		String mobileModel = userSelectedMobileModel;
		float mobilePrice = 0;
		for (int i = 0; i < applePhoneModels.length; i++) {
			if (applePhoneModels[i].equals(mobileModel)) {
				mobilePrice = applePhonePrice[i];
			}
		}
		return mobilePrice;
	}

	float monthlyPlanPriceFindingMethod(String userSelectedMobilePlan) {
		String mobilePlan = userSelectedMobilePlan;
		float planPrice = 0;
		for (int i = 0; i < commonPlanNames.length; i++) {
			if (commonPlanNames[i].equals(mobilePlan)) {
				planPrice = commonPlanPrice[i];
			}
		}
		return planPrice;
	}

	float totalMonthlyAmountFinderMethod(float mobilePrice, float mobilePlanPrice) {
		float phoneRate = mobilePrice;
		float phoneMonthlyRate = mobilePlanPrice;
		float totalMonthlyAmount = phoneRate + phoneMonthlyRate;
		return totalMonthlyAmount;
	}
}
