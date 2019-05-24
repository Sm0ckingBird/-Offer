package twenty;

import java.util.Stack;

import util.BinaryTreeNode;

public class Extra_InOrderTravsersal {
	
	public static BinaryTreeNode InOrderTravsersal(BinaryTreeNode root) {
		if(root == null)
			return null;
		
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		BinaryTreeNode cur = root;
		
		while(cur != null || !s.isEmpty()) {
			while(cur != null) {
				s.add(cur);
				cur = cur.left;
			}
			if(!s.isEmpty()) {
				cur = s.pop();
				System.out.print(cur.value + " ");
				cur = cur.right;
			}
		}
		
		
		return root;
	}
	
	public static void InOrderTravsersal_Iteration(BinaryTreeNode root) {
		if(root == null)
			return;
		
		InOrderTravsersal_Iteration(root.left);
		System.out.print(root.value + " ");
		InOrderTravsersal_Iteration(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode a = new BinaryTreeNode(10);
		BinaryTreeNode b = new BinaryTreeNode(6);
		BinaryTreeNode c = new BinaryTreeNode(14);
		BinaryTreeNode d = new BinaryTreeNode(4);
		BinaryTreeNode e = new BinaryTreeNode(8);
		BinaryTreeNode f = new BinaryTreeNode(12);
		BinaryTreeNode g = new BinaryTreeNode(16);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		
		InOrderTravsersal_Iteration(a);
		System.out.println();
		InOrderTravsersal(a);
	}

}
