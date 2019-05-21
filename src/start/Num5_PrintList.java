package start;

import java.util.Stack;

import util.ListNode;

public class Num5_PrintList {
	
	public static void PrintListReversly(ListNode head) {
		if(head == null)
			return;
		Stack<ListNode> stack = new Stack<ListNode>();
		
		ListNode cur = head;
		
		while(cur != null) {
			stack.push(cur);
			cur = cur.next;
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().value + "<-");
		}
		
		System.out.print("DummyHead");
	}
	
	//Without support space. (栈实质上就是递归)
	public static void PrintListReversly_2(ListNode head) {
		if(head == null)
			return;
		PrintListReversly_2(head.next);
		System.out.print(head.value + " ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		
		a.next = b;
		b.next = c;
		
		PrintListReversly_2(a);
	}

}
