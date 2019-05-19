package thirty;

import java.util.Arrays;
import java.util.Comparator;

public class Num33_Array2Min {
	
	public static String min_specific(int[] numbers) {
		if(numbers == null || numbers.length == 0){
			return "";
		}
		int len = numbers.length;
		String []str = new String[len];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		
		//这里根据自己定义的排序规则,新的排序规则,如若取最大值，~c1.compareTo(c2)
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String str1, String str2) {
				String c1 = str1 + str2;
				String c2 = str2 + str1;
				return c1.compareTo(c2);
			}
		});
		for(int i = 0; i < len; i++){
            sb.append(str[i]);
        }
		return sb.toString();
	}

	public static String min_simple(String[] numbers) {
		
		//permutation
		//pass
		
		return null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min_specific(new int[] {3,321,32}));
	}

}
