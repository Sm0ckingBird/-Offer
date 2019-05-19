package forty;

public class Num40_FindNumsAppearOnce {
	
	public static int FindNumsApperaOnce(int[] numbers) {
		
		int result = 0;
		
		for(int i = 0; i < numbers.length; i++)
			result ^= numbers[i];
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FindNumsApperaOnce(new int[]{3,3,4,4,1,1,9}));
	}

}
