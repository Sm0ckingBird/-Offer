package forty;

import java.util.ArrayList;
import java.util.List;

public class Num40_FindNumsAppearOnce {
	
	public static void FindNumsAppearOnce_Two(int[] numbers){
		int result = 0;
		for(int item : numbers)
			result ^= item;
		int index = FindFirstBitIsOne(result);
		int mask = (int)Math.pow(2, index);
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		for(int item : numbers)
			if((item & mask) != 0)
				l1.add(item);
			else
				l2.add(item);
		int[] array1 = new int[l1.size()];
		int[] array2 = new int[l2.size()];
		
		for(int i = 0; i < l1.size(); i++)
			array1[i] = l1.get(i);
		for(int j = 0; j < l2.size(); j++)
			array2[j] = l2.get(j);
		
		int num1 = FindNumsApperaOnce(array1);
		int num2 = FindNumsApperaOnce(array2);
		
		System.out.println(num1);
		System.out.println(num2);
	}
	
	private static int FindNumsApperaOnce(int[] numbers) {
		
		int result = 0;
		
		for(int i = 0; i < numbers.length; i++)
			result ^= numbers[i];
		
		
		return result;
	}
	
	private static int FindFirstBitIsOne(int num) {
		
		int index = 0;
		while(((num & 1) == 0) && (index < 8 * Integer.SIZE)) {
			num = num >> 1;
			index++;
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumsAppearOnce_Two(new int[]{3,3,4,4,1,1,9,8});
	}

}
