package start;

public class Num9_Fibonacci {
	
	public static long Fibonacci(int n) {
		if(n < 1)
			return 0;
		if(n == 1 || n == 2)
			return 1;
		long[] result = new long[n];
		result[0] = 1; result[1] = 1;
		
		for(int i = 2; i < n; i++)
			result[i] = result[i - 1] + result[i - 2];
		
		return result[n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(100));
	}

}
