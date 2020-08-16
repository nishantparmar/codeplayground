package com.nishant.tree;


public class BinarySearchTree {
	
	TreeNode root;
	
	public BinarySearchTree(TreeNode root) {
		this.root = root;
	}
	
	
	
	public void insert(int data) {
	
		TreeNode aNode = new TreeNode(data);
		
		if(root.left == null) {
			root.left = aNode;
			return;
		}else {
			if(root.right == null) {
				root.right = aNode;
				return;
			}
		}
		
		insertNode(aNode);
		
	}
	
	private void insertNode(TreeNode aNode) {
		
		
		
	}
	
	
	public void removeNode(int data) {
		
	}
	
	public boolean contains(int data) {
		
		
		return false;
	}
	
	public TreeNode search(int data) {
		
		
		return null;
	}

}
