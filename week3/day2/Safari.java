package week3.day2;

public class Safari extends Browser 
{
 
public void readerMode()

{
	System.out.println("Readermode Enabled");

}

public void fullScreenMode()

{
	System.out.println("The Browser is in fullmode");

}

public static void main(String[] args) {
	Safari obj = new Safari();
	obj.readerMode();
	obj.fullScreenMode();
	obj.openURL();
	obj.LoadURL();
	obj.closeBrowser();


}


}