package twenty;

import java.util.Stack;

public class Num22_StackPushPopSequence {
	
	public static boolean isValid(int[] push, int[] pop) {
		if(push == null || pop == null || push.length != pop.length)
			return false;
		if(push.length == 0)
			return true;
		
		Stack<Integer> support = new Stack<Integer>();
		int pointer = 0;
		
		for(int i = 0; i < pop.length; i++) {
			int cur = pop[i];
			if(support.isEmpty() || cur != support.peek()) {
				while(push[pointer] != cur) {
					support.push(push[pointer]);
					pointer++;
					if(pointer == push.length)
						return false;
				}
			}
			else
				support.pop();
		}
		
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isValid(new int[] {1,2,3,4,5},new int[] {3,2,1,5,4});
	}

}
