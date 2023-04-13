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
		
		int summ=0;
		while(n!=0) {
			int d=n%10;
			summ=summ*10+d;
			n=n/10;
		}
		System.out.println(summ);
	}

}
