package week3.day2;

public class Edge extends Browser {

	
	public void takeSnap()
	{
		System.out.println("Snap Taken");
	
	}public void clearCookies()
	{
		System.out.println("Cookies cleared");
	
	}
	
	public static void main(String[] args) {
		Edge obj = new Edge();
		obj.takeSnap();
		obj.clearCookies();
		obj.openURL();
		obj.LoadURL();
		obj.closeBrowser();


	}

}
