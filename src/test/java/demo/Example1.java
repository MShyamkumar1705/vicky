package demo;

public class Example1 {

	public static void main(String[] args) {
		int n=123;
//		int lastDigit=n%10;
//		int firstDigit=n;
//		while(firstDigit>10) {
//			firstDigit=firstDigit/10;
//		}
//		System.out.println(lastDigit+ " " +firstDigit);
		
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		System.out.println(sum+ "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");
	}

}
