package ten;

import util.ListNode;

public class Num17_MergeTwoSortedList {
	
	public static ListNode MergeTwoSortedList(ListNode h1, ListNode h2) {
		if(h1 == null && h2 == null)
			return null;
		if(h1 == null || h2 == null)
			return h1 == null? h2 : h1;
		
		ListNode dummyHead = new ListNode(0);
		ListNode p1 = h1;
		ListNode p2 = h2;
		dummyHead.next = h1.value < h2.value? h1:h2;
		
		while(p1 != null && p2 != null) {
			if(p1.value < p2.value) {
				while(p1.next != null && p1.next.value < p2.value)
					p1 = p1.next;
				ListNode temp = p1.next;
				p1.next = p2;
				p1 = temp;
			}
			else {
				while(p2.next != null && p2.next.value < p1.value)
					p2 = p2.next;
				ListNode temp = p2.next;
				p2.next = p1;
				p2 = temp;
			}
		}
		
		
		return dummyHead.next;
	}
	
	public static ListNode MergeTwoSortedList_Recursion(ListNode h1, ListNode h2) {
		if(h1 == null && h2 == null)
			return null;
		if(h1 == null || h2 == null)
			return h1 == null? h2 : h1;
		
		ListNode head = null;
		if(h1.value > h2.value) {
			head = h2;
			head.next = MergeTwoSortedList_Recursion(h1,h2.next);
		}
		else {
			head = h1;
			head.next = MergeTwoSortedList_Recursion(h1.next,h2);
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l5 = new ListNode(5);
		ListNode l7 = new ListNode(7);
		
		ListNode l2 = new ListNode(2);
		ListNode l4 = new ListNode(4);
		ListNode l6 = new ListNode(6);
		
		l1.next = l5; l5.next = l7;
		l2.next = l4; l4.next = l6;
		
		ListNode.printList(MergeTwoSortedList_Recursion(l1,l2));

	}

}
