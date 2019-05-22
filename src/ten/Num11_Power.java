package ten;

public class Num11_Power {
	
	protected static boolean isValid = true;
	
	public static double Power(double base, int exponent) {
		isValid = true;
		if(equal(base,0)) {
			if(exponent <= 0) {
				isValid = false;
				return -1;
			}
			else
				return 0;
		}
		
		if(exponent == 0)
			return 1;
		
		double result = 1;
		for(int i = 0; i < Math.abs(exponent); i++)
			result *= base;
		
		if(exponent > 0)
			return result;
		else
			return 1.0/result;
	}
	
	//要注意double类型的比较
	public static boolean equal(double num1, double num2) {
		if(Math.abs(num1 - num2) < 0.0000001)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power(2,0));
	}

}
