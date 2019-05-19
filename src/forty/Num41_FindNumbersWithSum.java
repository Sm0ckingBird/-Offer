package forty;

import java.util.Arrays;

public class Num41_FindNumbersWithSum {
	
	public static void FindNumbersWithSum(int[] numbers, int target) {
		Arrays.sort(numbers);
		if(numbers == null || numbers.length < 2)
			return;
		
		int slow = 0;
		int fast = numbers.length - 1;
		
		while(slow != fast) {
			while(numbers[slow] + numbers[fast] > target)
				fast--;
			if(numbers[slow] + numbers[fast] == target) {
				System.out.printf("%d %d",numbers[slow],numbers[fast]);
				return;
			}
			while(numbers[slow] + numbers[fast] < target)
				slow++;
			if(numbers[slow] + numbers[fast] == target) {
				System.out.printf("%d %d",numbers[slow],numbers[fast]);
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumbersWithSum(new int[] {1,2,4,7,11,15},15);
	}

}
