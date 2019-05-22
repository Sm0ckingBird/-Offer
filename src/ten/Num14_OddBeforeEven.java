package ten;

public class Num14_OddBeforeEven {
	
	public static void OddBeforeEven(int[] numbers) {
		if(numbers == null || numbers.length == 0)
			return;
		
		int low = 0;
		int high = numbers.length - 1;
		
		while(high > low) {
			while(numbers[low] % 2 == 1 && low < high)
				low++;
			if(low == high)
				break;
			while(numbers[high] % 2 == 0 && low < high)
				high--;
			swap(numbers,low,high);
		}
	}
	
	private static void swap(int[] numbers, int index1, int index2) {
		int temp = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddBeforeEven(new int[] {2,1,3,4,6,9,7,10});
	}

}
