package twenty;

import java.util.Stack;

import util.BinaryTreeNode;

public class Extra_PostOrderTraversal {
	
	public static void PostOrderTraversal_Recursion(BinaryTreeNode root) {
		if(root == null)
			return;
		
		PostOrderTraversal_Recursion(root.left);
		PostOrderTraversal_Recursion(root.right);
		System.out.print(root.value + " ");
	}
	
	public static void PostOrderTraversal_Iteration(BinaryTreeNode root) {
		if(root == null)
			return;
		
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = root;
        BinaryTreeNode last = null;
        while (node != null || !stack.isEmpty()) {
            while(node != null) {
            	stack.push(node);
            	node = node.left;
            }
            node = stack.peek();
            if(node.right == null || node.right == last) {
            	System.out.print(node.value + " ");
            	stack.pop();
            	last = node;
            	node = null;
            }
            else
            	node = node.right;
        }
        System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode l1 = new BinaryTreeNode(2);
		BinaryTreeNode l2 = new BinaryTreeNode(3);
		BinaryTreeNode l3 = new BinaryTreeNode(4);
		BinaryTreeNode l4 = new BinaryTreeNode(5);
		BinaryTreeNode l5 = new BinaryTreeNode(6);
		
		root.left = l1; root.right = l2;
		l1.left = l3; l1.right = l4;
		l2.right = l5;
		PostOrderTraversal_Recursion(root);
		System.out.println();
		PostOrderTraversal_Iteration(root);
	}

}
