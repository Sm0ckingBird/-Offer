package twenty;


import util.BinaryTreeNode;

public class Num27_BST2BiList {
	
	public static BinaryTreeNode BST2BiList(BinaryTreeNode root) {
		BinaryTreeNode last = ConvertNode(root);
		while(last.left != null)
			last = last.left;
		return last;
	}
	
	public static BinaryTreeNode ConvertNode(BinaryTreeNode node) {
		if(node == null)
			return null;
		
		BinaryTreeNode cur = node;
		BinaryTreeNode last = null;
		
		if(node.left != null)
			 last = ConvertNode(cur.left);
		
		cur.left = last;
		
		if(last != null)
			last.right = cur;
		
		if(cur.right != null)
			ConvertNode(cur.right);
		
		return cur;
	}
	
	
	public static void main(String[] args) {
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
		
		BST2BiList(a);
	}

}
