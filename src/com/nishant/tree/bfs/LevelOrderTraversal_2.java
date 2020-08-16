package com.nishant.tree.bfs;

import java.util.LinkedList;
import java.util.Queue;

import com.nishant.tree.TreeNode;

/**
 * 
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 * 
 * @author Nishant
 *
 */
public class LevelOrderTraversal_2 {

	public void traverse(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {

			/*
			 * poll() removes the present head. For more information on poll() visit
			 */
			TreeNode tempTreeNode = queue.poll();
			System.out.print(tempTreeNode.data + " ");

			/* Enqueue left child */
			if (tempTreeNode.left != null) {
				queue.add(tempTreeNode.left);
			}

			/* Enqueue right child */
			if (tempTreeNode.right != null) {
				queue.add(tempTreeNode.right);
			}
		}
	}
}
