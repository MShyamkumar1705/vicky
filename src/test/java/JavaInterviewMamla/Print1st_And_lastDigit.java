package JavaInterviewMamla;

public class Print1st_And_lastDigit {

	public static void main(String[] args) {
		int n=123;
		int firstDigit=n/100;
		int lastDigit=n%10;
		System.out.println("First digit is: " +firstDigit);
		System.out.println("Last digit is: " +lastDigit);

	}

}
