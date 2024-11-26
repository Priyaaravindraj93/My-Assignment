package week2.day1;

public class MethodWithReturnType {

	public String takePhoto()
	{ 
		return "jpeg,jpg,png";
	}
	
	public int checkAndroidVersion() {
		return 7;
	}
	
	public boolean checkCameraAvailableorNot() {
		return true;
	}
	public static void main(String[] args) {
		MethodWithReturnType mobActions=new MethodWithReturnType();
		System.out.println(mobActions.takePhoto());
	}

}
