package ten;

public class Num10_NumOfOnes {
	
	//此种方法一定要进行32次循环
	public static int numOfOnes(int number) {
		int count = 0;
		int flag = 1;
		while(flag != 0) {
			if((number & flag) != 0)
				count++;
			flag = flag << 1;
		}
		return count;
	}
	
	//利用一个数减1与它本身取位与会把第一个1变成0
	public static int numOfOnes_Advanced(int number) {
		int count = 0;
		if(number == 0)
			return 0;
		while(number != 0) {
			int temp = number - 1;
			number = number & temp;
			count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numOfOnes_Advanced(4));
	}

}
