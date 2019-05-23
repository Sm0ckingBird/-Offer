package util;

import java.util.List;

public class BinaryTreeNode {
	public int value;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode(int x) {
		value = x;
	}
	
	public static void printPath(List<Integer> l) {
		for(Integer item : l)
			System.out.print(item+"->");
		System.out.println("End");
	}
}
