package 剑指offer;

//May 16
public class Num32_CountOfOne {

	//暴力法
	public static int count_simple(int number) {
		int count = 0;
		
		for(int i = 1; i <= number; i++) {
			String temp = Integer.toString(i);
			for(char item: temp.toCharArray())
				if(item == '1')
					count++;
		}
		
		return count;
	}
	
	//
	public static int count(int number) {
		if(number <= 9 && number >= 1)
			return 1;
		if(number == 0)
			return 0;
		int n = number;
		int bits = 1;
		while(n / 10 > 0) {
			bits++;
			n /= 10;
		}
		int count = count_Recursion(bits-1);
		
		int temp = (int) (number / Math.pow(10, bits-1));
		
		if(temp > 1)
			count += Math.pow(10, bits-1) + count_Recursion(bits-1) * (temp-1) + count((int) (number-temp* Math.pow(10, bits-1)));
		else
			count += (int) (number- Math.pow(10, bits-1)) + 1 + count((int) (number-Math.pow(10, bits-1)));
		return count;
	}
	
	public static int count_Recursion(int bits) {
		if(bits <= 0)
			return 0;
		int[] temp = new int[bits];
		//1～9 1的个数为1
		temp[0] = 1;
		for(int i = 1; i < bits; i++) {
			temp[i] = (int) (temp[i - 1] * 10 + Math.pow(10, i));
		}
		return temp[bits-1];
	}
	
	public static void main(String[] args) {
		boolean result = true;
		for(int i = 100; i < 10000; i++) {
			if(count(i) != count_simple(i))
				result = false;
		}
		System.out.println(result);
	}
}
