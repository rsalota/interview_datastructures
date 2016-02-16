package com.seattletechinterviews.datastructures;

public interface MyTree {
	public void printInorder();
	public void printPreOrder();
	public void printPostOrder();
	public void balanceTree();
	public boolean isBinarySearchTree();
	public boolean isSymmetric(MyTree tree);
	public boolean findBfs(int value);
	public boolean findDfs(int value);
}
