package forty;

public class Num49_String2Int {
	
	protected static boolean isValid = true;
	
	public static int String2Int(String s) {
		
		isValid = true;
		
		if(s == null || s.length() == 0) {
			isValid = false;
			return 0;
		}
		
		long result = 0;
		int factor = 1;
		char start = s.charAt(0);
		
		if(isDigit(start))
			result = start - '0';
		else if(start == '+' || start == '-' && s.length() > 1)
			factor = start == '+'? 1: -1;
		else {
			isValid = false;
			return 0;
		}
		
		for(int i = 1; i < s.length(); i++) {
			char cur = s.charAt(i);
			if(!isDigit(cur)) {
				isValid = false;
				return 0;
			}
			result = result * 10 + (cur - '0');
			if((factor == 1 && result > 0x7FFFFFFF) || (factor == -1 && result > 0x80000000)) {
				isValid = false;
				return 0;
			}
		}
		
		return factor * (int)result;
	}
	
	private static boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String2Int("73902170127047"));
	}

}
