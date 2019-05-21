package start;

import java.util.Stack;

public class Num7_QueueBasedOnTwoStacks {
	
	private static Stack<Integer> left = new Stack<Integer>();
	private static Stack<Integer> right = new Stack<Integer>();
	protected static boolean isValid = true;
	
	public static boolean deleteHead() {
		if(left.isEmpty() && right.isEmpty())
			return false;
		if(!right.isEmpty())
			right.pop();
		else
			while(!left.isEmpty())
				right.add(left.pop());
		
		return true;
	}
	
	public static void appendTail(int x) {
		left.add(x);
	}
	
	public static int getHead() {
		isValid = true;
		if(left.isEmpty() && right.isEmpty()) {
			isValid = false;
			return -1;
		}
		if(!right.isEmpty())
			return right.peek();
		else
			while(!left.isEmpty())
				right.add(left.pop());
		return right.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appendTail(1);
		appendTail(2);
		appendTail(3);
		System.out.println(getHead());
		deleteHead();
		System.out.println(getHead());
	}

}
