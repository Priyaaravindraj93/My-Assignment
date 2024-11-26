package week2.day1;

public class LearnAccess {
	
	public void depositAmount() {
		System.out.println("5000");
	}
	
	private void withdrawAmount() {
		System.out.println("Withdraw amount");

	}
	
	void knowAtmPin() {
		System.out.println("1234");
	}
	
	public static void main(String[] args) {
		LearnAccess obj=new LearnAccess();
		obj.depositAmount();
		obj.withdrawAmount();
		obj.knowAtmPin();
	}

}