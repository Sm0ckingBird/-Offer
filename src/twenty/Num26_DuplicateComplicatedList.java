package twenty;

import java.util.HashMap;
import java.util.Map;

import util.ComplexListNode;

public class Num26_DuplicateComplicatedList {
	
	//哈希表的方法
	public static ComplexListNode DuplicateComplicatedList(ComplexListNode head) {
		if(head == null)
			return null;
		
		Map<ComplexListNode,ComplexListNode> m = new HashMap<ComplexListNode,ComplexListNode>();
		
		ComplexListNode cur = head;
		
		while(cur != null) {
			ComplexListNode temp = new ComplexListNode(cur.value);
			temp.next = cur.next;
			m.put(cur, temp);
			cur = cur.next;
		}
		
		cur = head;
		
		while(cur != null) {
			m.get(cur).sibling = m.get(cur.sibling);
			cur = cur.next;
		}
		
		
		return m.get(head);
	}
	
	//还有一种将复制的节点插在每一个对应节点的后面的方法
	//最后再拆分,此种方法不需要额外空间消耗
	public static ComplexListNode DuplicateComplicatedList_Advanced(ComplexListNode head) {
		if(head == null)
			return null;
		//第一步骤,插入新节点
		ComplexListNode cur = head;
		while(cur != null) {
			ComplexListNode next = cur.next;
			ComplexListNode copy = new ComplexListNode(cur.value);
			cur.next = copy;
			copy.next = next;
			cur = next;
		}
		
		//第二步骤,更新copy节点的sibling指针
		cur = head;
		while(cur != null) {
			if(cur.sibling != null)
				cur.next.sibling = cur.sibling.next;
			cur = cur.next.next;
		}
		
		//第三部分拆分链表
		cur = head;
		ComplexListNode new_cur = head.next;
		ComplexListNode result = head.next;
		
		while(cur != null) {
			ComplexListNode next = cur.next.next;
			if(next == null)
				break;
			new_cur.next = next.next;
			cur.next = next;
			cur = next;
			new_cur = next.next;
		}
		
		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexListNode a = new ComplexListNode(1);
		ComplexListNode b = new ComplexListNode(2);
		ComplexListNode c = new ComplexListNode(3);
		ComplexListNode d = new ComplexListNode(4);
		ComplexListNode e = new ComplexListNode(5);
		
		a.next = b; b.next = c; c.next = d; d.next = e;
		a.sibling = c; b.sibling = e;
		d.sibling = b;
		DuplicateComplicatedList(a);
		DuplicateComplicatedList_Advanced(a);
	}

}
