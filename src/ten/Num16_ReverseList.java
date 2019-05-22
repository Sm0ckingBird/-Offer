package ten;

import util.ListNode;

public class Num16_ReverseList {
	
	public static ListNode ReverseList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		
		ListNode prev = head;
		ListNode cur = prev.next;
		head.next = null;
		ListNode next = cur.next;
		
		while(cur.next != null) {
			cur.next = prev;
			prev = cur;
			cur = next;
			next = next.next;
		}
		
		cur.next = prev;
		return cur;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		ListNode.printList(a);
		ListNode.printList(ReverseList(a));
	}

}
