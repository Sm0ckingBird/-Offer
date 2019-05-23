package twenty;

import java.util.LinkedList;
import java.util.Queue;

import util.BinaryTreeNode;

public class Num23_PrintBinaryTree {
	
	public static void PrintBinaryTree(BinaryTreeNode root){
		if(root == null)
			return;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				BinaryTreeNode cur = q.poll();
				if(cur.left != null)
					q.add(cur.left);
				if(cur.right != null)
					q.add(cur.right);
				System.out.print(cur.value + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = new BinaryTreeNode(8);
		BinaryTreeNode l1 = new BinaryTreeNode(6);
		BinaryTreeNode l2 = new BinaryTreeNode(10);
		BinaryTreeNode l3 = new BinaryTreeNode(5);
		BinaryTreeNode l4 = new BinaryTreeNode(7);
		BinaryTreeNode l5 = new BinaryTreeNode(9);
		BinaryTreeNode l6 = new BinaryTreeNode(11);
		
		root.left = l1;
		root.right = l2;
		l1.left = l3;
		l1.right = l4;
		l2.left = l5;
		l2.right = l6;
		
		PrintBinaryTree(root);
	}

}
