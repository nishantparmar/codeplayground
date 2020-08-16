package com.nishant.tree.bfs;

import com.nishant.tree.TreeNode;

/**
 * Time Complexity - O(n^2)
 * Space Complexity - O(n)
 * 
 * @author Nishant
 *
 */
public class LevelOrderTraversal_1 {

	/* function to print level order traversal of tree */
	public void traverse(TreeNode root) {
		int h = height(root); // O(n)
		int i;
		for (i = 1; i <= h; i++) // O(n*n)
			printGivenLevel(root, i);
	}

	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest path
	 * from the root node down to the farthest leaf node.
	 */
	public int height(TreeNode root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	/* Print nodes at the given level */
	public void printGivenLevel(TreeNode root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.println(root.data + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

}
