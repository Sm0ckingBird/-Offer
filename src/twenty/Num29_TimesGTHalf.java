package twenty;

import java.util.Arrays;

public class Num29_TimesGTHalf {
	
	//中位数 Partition
	public static int TimesGTHalf(int[] array) {
		
		Arrays.sort(array);
		
		return array[array.length / 2];
	}
	
	//计算times的投票方法

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
