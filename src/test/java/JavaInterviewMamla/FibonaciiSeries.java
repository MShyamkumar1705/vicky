package JavaInterviewMamla;

public class FibonaciiSeries {

	public static void main(String[] args) {
		int n=10;
		int firstTerm=0;
		int secondTerm=1;
		for (int i = 0; i <n; i++) {
			int fib=firstTerm+secondTerm;
			System.out.println(firstTerm);
			firstTerm=secondTerm;
			secondTerm=fib;
		}

	}

}
