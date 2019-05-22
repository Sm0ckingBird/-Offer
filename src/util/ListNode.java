package util;

public class ListNode {
	
	public static void printList(ListNode head) {
		ListNode cur = head;
		while(cur != null) {
			System.out.print(cur.value + "->");
			cur = cur.next;
		}
		System.out.println("end");
	}
	
	public int value;
	public ListNode next;

	public ListNode(int x){
		value = x;
	}
}
