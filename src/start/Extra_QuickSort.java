package start;

public class Extra_QuickSort {
	
	public static void quickSort(int[] numbers) {
		if(numbers == null || numbers.length == 0)
			return;
		quickSortCore(numbers,0,numbers.length);
	}
	
	
	private static void quickSortCore(int[] numbers, int low, int high) {
		if(high - low == 1 || high - low == 0)
			return;
		
		int pivot = numbers[low];
		
		int left = low;
		int right = high - 1;
		
		while(right > left) {
			while(numbers[right] > pivot && right > left)
				right--;
			numbers[left] = numbers[right];
			while(numbers[left] < pivot && left < right)
				left++;
			numbers[right] = numbers[left];
		}
		
		numbers[left] = pivot;
		
		quickSortCore(numbers,low,left);
		quickSortCore(numbers,left+1,high);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = new int[] {5,1,6,7,2};
		quickSort(temp);
	}

}
