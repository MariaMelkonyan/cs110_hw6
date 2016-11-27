package Utils;

public class Math {
	
	 public static int factorialR (int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorialR(n-1); 
	}
	
	public static int factorialLoop (int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num *= i;
		}	
		return num;
	}
}
