package ten;

import util.BinaryTreeNode;

public class Num19_MirrorOfBinaryTree {
	
	public static BinaryTreeNode MirrorOfBinaryTree(BinaryTreeNode root) {
		if(root == null)
			return null;
		
		BinaryTreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		MirrorOfBinaryTree(root.left);
		MirrorOfBinaryTree(root.right);
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode l1 = new BinaryTreeNode(8);
		BinaryTreeNode l2 = new BinaryTreeNode(6);
		BinaryTreeNode l3 = new BinaryTreeNode(10);
		BinaryTreeNode l4 = new BinaryTreeNode(5);
		BinaryTreeNode l5 = new BinaryTreeNode(7);
		BinaryTreeNode l6 = new BinaryTreeNode(9);
		BinaryTreeNode l7 = new BinaryTreeNode(11);
		
		l1.left = l2;
		l1.right = l3;
		l2.left = l4;
		l2.right = l5;
		l3.left=l6;l3.right=l7;
		MirrorOfBinaryTree(l1);
	}

}
