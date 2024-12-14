package week3.day3;

public class Hdfc implements RBI {

	public static void main(String[] args) {
		Hdfc hd=new Hdfc();
		hd.mandatoryKYC();
		hd.depositLimit();

	}

	@Override
	public void mandatoryKYC() {
		System.out.println("Driving Licence");
		
	}

	@Override
	public void depositLimit() {
		System.out.println("5L to 10L");
		
	}

}