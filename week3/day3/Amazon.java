package week3.day3;

public class Amazon extends CanaraBank{

	public static void main(String[] args) {
		Amazon impl = new Amazon();
		impl.recordPaymentDetails();
		impl.cashOnDelivery();
		impl.upiPayments();
		impl.cardPayments();
		impl.internetBanking();

	}
@Override
public void cashOnDelivery()
{
	System.out.println("cashOnDelivery is available");
}@Override
public void upiPayments()
{System.out.println("you can pay thru UPI");

}
@Override
public void cardPayments()
{
	System.out.println("cardPayments is also available");
}
@Override
public void internetBanking()
{
	System.out.println("internetBanking can be done");
}

}


