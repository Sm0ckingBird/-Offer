package ten;

import java.util.Arrays;

public class Num12_Print1ToMaxN {
	
	public static void Print1ToMaxN(int n) {
		char[] cur = new char[n];
		Arrays.fill(cur, '0');
		while(!isTerminal(cur)) {
			trimAndPrint(cur);
			plusOne(cur);
		}
		trimAndPrint(cur);
	}
	
	private static void plusOne(char[] cur) {
		int length = cur.length;
		if(cur[length - 1] != '9')
			cur[length - 1] = (char) (cur[length - 1] + 1);
		else {
			int index = length - 1;
			while(cur[index] == '9') {
				cur[index] = '0';
				index--;
			}
			cur[index] = (char) (cur[index] + 1);
		}
	}
	
	private static boolean isTerminal(char[] number) {
		boolean isTerminal = true;
		for(char item: number)
			if(item != '9') {
				isTerminal = false;
				break;
			}
		return isTerminal;
	}
	
	private static void trimAndPrint(char[] cur) {
		int index = 0;
		while(cur[index] == '0' && index < cur.length - 1)
			index++;
		for(int i = index; i < cur.length; i++)
			System.out.print(cur[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print1ToMaxN(4);
	}

}
