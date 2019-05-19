package 剑指offer;

import util.BinaryTreeNode;

public class Num39_DepthOfTree {
	
	public static int depth(BinaryTreeNode node) {
		if(node == null)
			return 0;
		return Math.max(depth(node.left), depth(node.right)) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode n1 = new BinaryTreeNode(1);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n6 = new BinaryTreeNode(6);
		BinaryTreeNode n7 = new BinaryTreeNode(7);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n5.left = n7;
		n3.right = n6;
		
		System.out.println(depth(n1));
	}

}
