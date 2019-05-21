package forty;

import java.util.LinkedList;
import java.util.Queue;

import util.TreeNode;

public class Num50_PublicNode {
	
	//使用辅助空间，将问题转换为链表的公共节点
	
	//直接遍历，但会出现很多重复

	public static TreeNode PublicNode(TreeNode root,TreeNode n1, TreeNode n2) {
		if(root == null || n1 == null || n2 == null)
			return null;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode cur = q.poll();
			boolean isLowest = true;
			for(int i = 0; i < cur.children.size(); i++) {
				if(isChild(cur.children.get(i),n1) && isChild(cur.children.get(i),n2)) {
					isLowest = false;
					q.add(cur.children.get(i));
					break;
				}
			}
			if(isLowest)
				return cur;
		}
		
		return null;
	}
	
	private static boolean isChild(TreeNode root, TreeNode n) {
		if(root == null || n == null)
			return false;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode cur = q.poll();
			if(cur == n)
				return true;
			q.addAll(cur.children);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode A = new TreeNode(1);
		TreeNode B = new TreeNode(2);
		TreeNode C = new TreeNode(3);
		TreeNode D = new TreeNode(4);
		TreeNode E = new TreeNode(5);
		TreeNode F = new TreeNode(6);
		TreeNode G = new TreeNode(7);
		TreeNode H = new TreeNode(8);
		TreeNode I = new TreeNode(9);
		TreeNode J = new TreeNode(10);
		A.children.add(B);A.children.add(C);
		B.children.add(D);B.children.add(E);
		D.children.add(F);D.children.add(G);
		E.children.add(H);E.children.add(I);
		E.children.add(J);
		
		PublicNode(A,F,I);
	}

}
