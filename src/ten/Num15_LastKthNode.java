package ten;

import util.ListNode;

public class Num15_LastKthNode {
	
	public static ListNode LastKthNode(ListNode head, int k) {
		if(head == null || k <= 0)
			return null;
		
		ListNode explorer = head;
		ListNode result = head;
		
		while(k > 1) {
			explorer = explorer.next;
			if(explorer == null)
				return null;
			k--;
		}
		
		while(explorer.next != null) {
			result = result.next;
			explorer = explorer.next;
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		a.next = b;
		b.next = c;
		System.out.println(LastKthNode(a,1).value);
	}

}
