package JavaInterviewMamla;

public class StrongNumber {

	public static void main(String[] args) {
		int n=9474;
		int sum=0;
		int temp=n;
		int count=digit(n);
		while(n>0) {
			int d=n%10;
			sum=sum+fact(d,count);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(sum+ " is a Strong Number");
		}
		else {
			System.out.println(sum+ " is not a Strong Number");
		}

	}
	public static int fact(int d, int count) {
		int p=1;
		while(count!=0) {
			p=p*d;
			count--;
		}
		return p;
	}
	public static int digit( int n) {
		int totalDigits=0;
		while(n>0) {
			totalDigits++;
			n=n/10;
		}
		return totalDigits;
	}

}
