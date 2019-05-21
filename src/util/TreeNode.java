package util;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	public int value;
	public List<TreeNode> children;
	
	public TreeNode(int x) {
		value = x;
		children = new ArrayList<TreeNode>();
	}
}
