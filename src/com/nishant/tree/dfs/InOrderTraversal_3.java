package com.nishant.tree.dfs;

import com.nishant.tree.TreeNode;

/**
 * Morris Traversal Preorder
 * 
 * Using Morris Traversal, we can traverse the tree without using stack and
 * recursion.
 * 
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 * 
 * @author Nishant
 *
 */
public class InOrderTraversal_3 {

	public void traverse(TreeNode node) {
		while (node != null) {

			// If left child is null, print the current node data. Move to
			// right child.
			if (node.left == null) {
				System.out.println(node.data + " ");
				node = node.right;
			} else {

				// Find inorder predecessor
				TreeNode current = node.left;
				while (current.right != null && current.right != node) {
					current = current.right;
				}

				// If the right child of inorder predecessor
				// already points to this node
				if (current.right == node) {
					current.right = null;
					node = node.right;
				}

				// If right child doesn't point to this node, then print
				// this node and make right child point to this node
				else {
					System.out.println(node.data + " ");
					current.right = node;
					node = node.left;
				}
			}
		}
	}

}
