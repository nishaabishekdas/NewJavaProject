package practicalInterviewQuestionsPackage;

public class MountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mountainArray= {3,4,7,2,1};
		boolean isUpMountain=false;
		boolean isDownMountain=false;
		for(int i=0;i<mountainArray.length/2;i++) {
			if(mountainArray[i]<mountainArray[i+1]) {
				isUpMountain=true;
			}else {
				isUpMountain=false;
				break;
			}
		}
		for(int i=mountainArray.length/2;i<mountainArray.length-1;i++) {
			if(mountainArray[i]>mountainArray[i+1]) {
				isDownMountain=true;
			}else {
				isDownMountain=false;
				break;
			}
		}
		if(isUpMountain==true&&isDownMountain==true) {
			System.out.println("Mountain Array");
		}else {
			System.out.println("Not Mountain Array");
		}
	}
	

}
