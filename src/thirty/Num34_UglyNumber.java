package thirty;

public class Num34_UglyNumber {
	
	public static int uglyNumber(int offset) {
		if(offset < 1)
			return 0;
		int[] result = new int[offset];
		result[0] = 1;
		
		int two_index = 0;
		int three_index = 0;
		int five_index = 0;
		
		for(int i = 1; i < offset; i++) {
			while(result[two_index]*2 <= result[i-1])
				two_index++;
			while(result[three_index]*3 <= result[i-1])
				three_index++;
			while(result[five_index]*5  <= result[i-1])
				five_index++;
			result[i] = Math.min(Math.min(result[two_index]*2,result[three_index]*3), 
					result[five_index]*5);
		}
		
		return result[offset-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uglyNumber(1500));
	}

}
