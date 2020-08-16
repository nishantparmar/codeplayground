package com.nishant.tree;

public class TreeNode {
	public TreeNode left;
	public TreeNode right;
	public int data;

	TreeNode(int x) {
		data = x;
	}

	@Override
	public String toString() {
		return "TreeNode [left=" + left + ", right=" + right + ", data=" + data + "]";
	}
	
	
}
