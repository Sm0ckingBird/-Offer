package forty;

public class Num42_LeftRotate {
	
	public static String leftRotatae(String s, int step) {
		if(s == null || s.length() == 0)
			return null;
		char[] chars = s.toCharArray();
		int length = s.length();
		step %= length;
		
		for(int i = 0; i < step; i++)
			swap(chars, i, length - i - 1);
		
		for(int j = 0; j < step / 2; j++)
			swap(chars,j, step-j-1);
		
		for(int z = step; z < (length-step)/2+step; z++)
			swap(chars,z,length-1-z+step);
		
		return String.valueOf(chars);
	}
	
	private static void swap(char[] chars,int l, int r) {
		char temp = chars[l];
		chars[l] = chars[r];
		chars[r] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(leftRotatae("12345",2));
	}

}
