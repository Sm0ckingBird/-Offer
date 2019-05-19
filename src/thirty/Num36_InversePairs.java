package thirty;

public class Num36_InversePairs {
	
	public static int InversePairs_Plain(int[] numbers) {
		int result = 0;
		
		for(int i = 0; i < numbers.length -1; i++) {
			for(int j = i + 1; j < numbers.length; j++)
				if(numbers[i] > numbers[j])
					result++;
		}
		
		return result;
	}
	
	//归并排序的方式去解决
	public static int InversePairs(int[] numbers,int low, int high) {
		if(high - low == 1)
			return 0;
		int count = 0;
		int mid = (low + high) / 2;
		int left = InversePairs(numbers,low, mid);
		int right = InversePairs(numbers,mid, high);
		
		int[] temp = new int[high-low];
		int p1 = mid - 1;
		int p2 = high - 1;
		int p3 = high - low - 1;
		
		while(p1 >= low && p2 >= mid) {
			if(numbers[p1] > numbers[p2]) {
				count += (p2 - mid + 1);
				temp[p3--] = numbers[p1--];
			}
			else {
				temp[p3--] = numbers[p2--];
			}
		}
		
		while(p1 >= low)
			temp[p3--] = numbers[p1--];
		
		while(p2 >= mid)
			temp[p3--] = numbers[p2--];
		
		for(int i = low; i < high; i++)
			numbers[i] = temp[i-low];
			
		
		return left + count + right;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InversePairs_Plain(new int[] {7,5,6,4}));
		System.out.println(InversePairs(new int[] {7,5,6,4},0,4));
	}

}
