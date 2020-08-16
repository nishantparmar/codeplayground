package com.nishant.tree.bfs;

import com.nishant.tree.TreeNode;

public class PrintLevels {
	
	// 5
	// 10 15
	// 20 25 30 35
	
	

	/* function to print level order traversal of tree */
	public void traverse(TreeNode root) {
		int height = height(root); // O(n)
		int i;
		for (i = 1; i <= height; i++) // O(n*n)
			printGivenLevel(root, i);
			System.out.println(); 
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
			System.out.println(root.data);
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}


}
