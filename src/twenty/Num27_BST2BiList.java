package twenty;


import java.util.Stack;

import util.BinaryTreeNode;

public class Num27_BST2BiList {
	
	public static BinaryTreeNode BST2BiList(BinaryTreeNode root) {
		if(root == null)
			return null;
		
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		BinaryTreeNode cur = root;
		
		while(cur != null || !s.isEmpty()) {
			while(cur != null) {
				s.add(cur);
				cur = cur.left;
			}
			if(s.isEmpty()) {
				cur = s.pop();
			}
		}
		
		
		return root;
	}
	
	
	
	
	public static void main(String[] args) {
		
	}

}
