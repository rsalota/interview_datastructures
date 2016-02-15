package com.seattletechinterviews.datastructures;

public interface MyBinarySearchTree {
	public void insert(int value);
	public void remove(int value);
	public Integer get(int value);
	public void printInorder();
	public void printPreOrder();
	public void printPostOrder();
}
