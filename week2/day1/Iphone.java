package week2.day1;

public class Iphone {

	public void takeHQPhoto ()
	{
		System.out.println("Take HQ Photo");
	}
	public void main(String[] args)
	{
	Iphone obj=new Iphone();
	obj.takeHQPhoto();
	
	Mobile mob=new Mobile();
	mob.takePhoto();
	
	mob.makeCall();
	mob.sendSms();

	}

}
