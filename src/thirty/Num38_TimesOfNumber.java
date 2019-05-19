package thirty;

import java.util.Arrays;

public class Num38_TimesOfNumber {
	
	private static int getLeftIndex(int[] numbers, int target) {
		int low = 0;
		int high = numbers.length;
		int mid = 0;
		
		while(high > low) {
			mid = (low + high) / 2;
			if(numbers[mid] < target)
				low = mid + 1;
			else
				high = mid;
		}
		
		
		if(low != numbers.length && numbers[low] == target)
			return low;
		else
			return -1;
	}
	
	private static int getRightIndex(int[] numbers, int target) {
		int low = 0;
		int high = numbers.length;
		int mid = 0;
		
		while(high > low) {
			mid = (low + high) / 2;
			if(numbers[mid] > target)
				high = mid;
			else
				low = mid + 1;
		}
		if(low == 0) {
			if(numbers[low] == target)
				return 0;
			else
				return -1;
		}
		else if(numbers[low - 1] == target)
			return low - 1;
		else
			return -1;
	}
	
	public static int getCount(int[] numbers, int target) {
		if(numbers == null || numbers.length == 0)
			return 0;
		
		Arrays.sort(numbers);
		int left = getLeftIndex(numbers, target);
		int right = getRightIndex(numbers, target);
		
		if(left == -1 || right == -1)
			return 0;
		else
			return right - left + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCount(new int[] {1,2,3,3,3,3,4,5},6));
	}

}
