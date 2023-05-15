package JavaInterviewMamla;

public class ArmStrong {

	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int temp=n;
		while(n>0) {
			int d=n%10;
			sum=sum+fact(d);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(sum+ " is a Armstrong Number");
		}
		else {
			System.out.println(sum+ " is not a Armstrong Number");
		}

	}
	public static int fact(int d) {
		int p=1;
		while(d>0) {
			p=p*d;
			d--;
		}
		return p;
	}

}
