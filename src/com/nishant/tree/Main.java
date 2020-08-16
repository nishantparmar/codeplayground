package com.nishant.tree;

import com.nishant.tree.bfs.PrintLevels;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(10);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(25);
		root.right.left = new TreeNode(30);
		root.right.right = new TreeNode(35);

		// 5
		// 10 - 15
		// 20 - 25 30 - 35

		PrintLevels lvl = new PrintLevels();
		lvl.traverse(root);
		
		/*
		 * LevelOrderTraversal_1 option1 = new LevelOrderTraversal_1();
		 * option1.traverse(root); System.out.println("-----"); LevelOrderTraversal_2
		 * option2 = new LevelOrderTraversal_2(); option2.traverse(root);
		 * System.out.println("-----"); InOrderTraversal_3 option3 = new
		 * InOrderTraversal_3(); option3.traverse(root); System.out.println("-----");
		 * InOrderTraversal_4 option4 = new InOrderTraversal_4();
		 * option4.traverse(root);
		 */
	}

}
