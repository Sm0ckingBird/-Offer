package ten;

import util.ListNode;

public class Num13_DeleteNode {
	
	protected static ListNode head = new ListNode(0);
	
	public static void DeleteNode(ListNode deleting) {
		if(head == null)
			return;
		if(deleting == head) {
			head = deleting.next;
			return;
		}
		if(deleting.next == null) {
			ListNode cur = head;
			while(cur.next.next != null)
				cur = cur.next;
			cur.next = null;
			return;
		}
		
		deleting.value = deleting.next.value;
		deleting.next = deleting.next.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		head.next = a;
		a.next = b;
		
		//DeleteNode(head);
		//DeleteNode(a);
		DeleteNode(b);
		ListNode.printList(head);
	}

}
