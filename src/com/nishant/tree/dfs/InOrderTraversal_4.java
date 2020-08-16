package com.nishant.tree.dfs;

import com.nishant.tree.TreeNode;

/**
 * Morris Traversal Inorder
 * 
 * Using Morris Traversal, we can traverse the tree without using stack and
 * recursion.
 * 
 * @author Nishant
 *
 */
public class InOrderTraversal_4 {

	public void traverse(TreeNode root) {
		TreeNode current, pre;

		if (root == null)
			return;

		current = root;
		while (current != null) {
			if (current.left == null) {
				System.out.println(current.data + " ");
				current = current.right;
			} else {
				/* Find the inorder predecessor of current */
				pre = current.left;
				while (pre.right != null && pre.right != current)
					pre = pre.right;

				/* Make current as right child of its inorder predecessor */
				if (pre.right == null) {
					pre.right = current;
					current = current.left;
				}

				/*
				 * Revert the changes made in the 'if' part to restore the original tree i.e.,
				 * fix the right child of predecessor
				 */
				else {
					pre.right = null;
					System.out.println(current.data + " ");
					current = current.right;
				} /* End of if condition pre->right == NULL */

			} /* End of if condition current->left == NULL */

		} /* End of while */
	}

}
