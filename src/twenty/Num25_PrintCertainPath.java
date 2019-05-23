package twenty;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.BinaryTreeNode;

public class Num25_PrintCertainPath {
	
	public static void PrintCertainPath(BinaryTreeNode root, int value) {
		if(root == null)
			return;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		List<List<Integer>> possibilities = new LinkedList<List<Integer>>();
		List<Integer> temp = new LinkedList<Integer>();
		
		permutation(root, temp, possibilities);
		
		for(List<Integer> list: possibilities) {
			int sum = 0;
			for(Integer item: list)
				sum += item;
			if(sum == value)
				BinaryTreeNode.printPath(list);
		}
	}
	
	private static void permutation(BinaryTreeNode cur, List<Integer> temp, List<List<Integer>> possibilities) {
		temp.add(cur.value);
		if(cur.left == null && cur.right == null) {
			List<Integer> possibility = new LinkedList<Integer>();
			possibility.addAll(temp);
			possibilities.add(possibility);
		}
		else {
			if(cur.left != null)
				permutation(cur.left, temp ,possibilities);
			if(cur.right != null)
				permutation(cur.right, temp ,possibilities);
		}
		temp.remove(temp.size() - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = new BinaryTreeNode(10);
		BinaryTreeNode l1 = new BinaryTreeNode(5);
		BinaryTreeNode l2 = new BinaryTreeNode(12);
		BinaryTreeNode l3 = new BinaryTreeNode(4);
		BinaryTreeNode l4 = new BinaryTreeNode(7);
		
		root.left = l1;
		root.right = l2;
		l1.left = l3;
		l1.right = l4;
		
		PrintCertainPath(root,22);
	}

}
