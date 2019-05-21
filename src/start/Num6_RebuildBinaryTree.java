package start;

import util.BinaryTreeNode;

public class Num6_RebuildBinaryTree {
	
	public static BinaryTreeNode RebuildBinaryTree(int[] preOrder, int pStart, int pEnd, 
			int[] inOrder, int iStart, int iEnd) {
		
		if(pEnd - pStart == 1)
			return new BinaryTreeNode(preOrder[pStart]);
		if(pEnd == pStart)
			return null;
		if(pEnd - pStart != iEnd - iStart)
			return null;
		
		int value = preOrder[pStart];
		BinaryTreeNode root = new BinaryTreeNode(value);
		
		int i = 0;
		for(i = iStart; i < iEnd; i++)
			if(inOrder[i] == value)
				break;
		
		int length = i - iStart;
		
		root.left = RebuildBinaryTree(preOrder,pStart+1,pStart+length+1,
				inOrder,iStart,iStart+length);
		root.right = RebuildBinaryTree(preOrder,pStart+length+1,pEnd,
				inOrder,iStart+length+1,iEnd);
		
		return root;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RebuildBinaryTree(new int[] {1,2,4,7,3,5,6,8},0,8, new int[] {4,7,2,1,5,3,8,6},0,8);
	}

}
