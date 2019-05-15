package 剑指offer;

public class Num31_MaxSubArraySum {
	
	public static int MaxSum(int[] nums) {
		int tempSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] >= 0) {
				tempSum += nums[i];
				if(tempSum > maxSum)
					maxSum = tempSum;
			}
			else {
				tempSum += nums[i];
				if(tempSum > maxSum)
					maxSum = tempSum;
				if(tempSum < 0)
					tempSum = 0;
			}
		}
		
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {8,-19,5,-4,20};
		MaxSum(arr);
	}
	
}
