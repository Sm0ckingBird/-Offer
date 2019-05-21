package start;

public class Num4_ReplaceBlank {
	
	public static String ReplaceBlank(String s) {
		
		if(s == null || s.length() == 0)
			return s;
		
		int length = s.length();
		int blanks = 0;
		
		for(int i = 0; i < length; i++)
			if(s.charAt(i) == ' ')
				blanks++;
		
		int new_length = length + blanks * 2;
		char[] result = new char[new_length];
		
		for(int i = 0, j = 0; i < length; i++) {
			if(s.charAt(i) == ' ') {
				result[j] = '%';
				result[j+1] = '2';
				result[j+2] = '0';
				j += 3;
			}
			else {
				result[j] = s.charAt(i);
				j++;
			}
		}
		
		return String.valueOf(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReplaceBlank("We are young."));
	}

}
