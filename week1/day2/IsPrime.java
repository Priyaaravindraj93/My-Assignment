package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int N = 9;
		boolean isPrime = true;
		for(int i = 2; i < N; i++) {
			if(N % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(N + " is a prime number");
		} else {
			System.out.println(N + " is not a prime number");
		}
	}
}