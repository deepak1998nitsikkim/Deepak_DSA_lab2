package com.greatlearning.hashtreesum;

public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}

	public TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}
}