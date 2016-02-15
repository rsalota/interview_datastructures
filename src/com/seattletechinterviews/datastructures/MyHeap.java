package com.seattletechinterviews.datastructures;

public interface MyHeap {
	public int findMin();
	public int findMax();
	public void insert(int value);
	public void remove(int value);
	public void merge(MyHeap toMergeHeap);
}