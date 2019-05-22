package ten;

import java.util.LinkedList;
import java.util.Queue;
import util.BinaryTreeNode;

public class Num18_SubStructureOfTree {
	
	public static boolean isSubStructure(BinaryTreeNode A, BinaryTreeNode B) {
		if(A == null)
			return false;
		Queue<BinaryTreeNode> s = new LinkedList<BinaryTreeNode>();
		s.add(A);
		
		while(!s.isEmpty()) {
			BinaryTreeNode cur = s.poll();
			if(cur.value == B.value) {
				if(isEqual(cur,B))
					return true;
			}
			s.add(cur.left);
			s.add(cur.right);
		}
		
		return false;
	}
	
	public static boolean isEqual(BinaryTreeNode root, BinaryTreeNode B) {
		if(B == null)
			return true;
		if(root == null)
			return false;
		else
			return root.value == B.value && isEqual(root.left,B.left) && isEqual(root.right, B.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode l1 = new BinaryTreeNode(8);
		BinaryTreeNode l2 = new BinaryTreeNode(8);
		BinaryTreeNode l3 = new BinaryTreeNode(7);
		BinaryTreeNode l4 = new BinaryTreeNode(9);
		BinaryTreeNode l5 = new BinaryTreeNode(2);
		BinaryTreeNode l6 = new BinaryTreeNode(4);
		BinaryTreeNode l7 = new BinaryTreeNode(7);
		
		l1.left = l2; l1.right = l3;
		l2.left = l4; l2.right = l5;
		l5.left = l6; l5.right = l7;
		
		BinaryTreeNode b1 = new BinaryTreeNode(8);
		BinaryTreeNode b2 = new BinaryTreeNode(9);
		BinaryTreeNode b3 = new BinaryTreeNode(2);
		b1.left = b2; b1.right = b3;
		
		isSubStructure(l1,b1);
	}

}
