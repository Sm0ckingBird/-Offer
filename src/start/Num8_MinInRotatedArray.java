package start;

public class Num8_MinInRotatedArray {
	
	//如果low,high,mid指向的数字是相同的,则只能使用一般方法求解
	//
	
	public static int min(int[] numbers) throws Exception {
		if(numbers == null || numbers.length == 0)
			throw new Exception();
		if(numbers[0] < numbers[numbers.length - 1])
			return numbers[0];
		
		int low = 0;
		int high = numbers.length;
		
		while(true) {
			int mid = (low + high) / 2;
			if(numbers[mid] < numbers[mid - 1])
				return numbers[mid];
			else if(numbers[mid] > numbers[low])
				low = mid + 1;
			else
				high = mid;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(min(new int[] {1,0,1,1,1}));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
