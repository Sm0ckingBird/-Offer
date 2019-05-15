package 剑指offer;

public class Num31_MaxSubArraySum {
	
	//Analyzing the Array..
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
	
	//Dynamic Programming
	public static int MaxSum_DP(int[] nums, int index) {
		if(nums.length == 0)
			return 0;
		if(index == 0)
			return nums[0];
		else {
			if(MaxSum_DP(nums,index-1) > 0)
				return MaxSum_DP(nums,index-1) + nums[index];
			else
				return nums[index];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {8,-19,5,-4,20};
		System.out.println(MaxSum(arr));
		System.out.println(MaxSum_DP(arr,4));
	}
	
}
