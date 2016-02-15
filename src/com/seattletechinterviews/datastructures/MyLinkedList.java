package com.seattletechinterviews.datastructures;

public interface MyLinkedList {
	/**
	 * Add a value to the head of the linked list.
	 * @param value
	 */
	public void add(int value);
	/**
	 * Remove the node at a particular location and return the 
	 * value at that node. The node location start at 0 and 0 is 
	 * the head. 
	 * @param location
	 */
	public int removeAt(int location);
	/**
	 * Append the value at the end of the linkedlist.
	 * @param value
	 */
	public void append(int value);
	/**
	 * Count the total number of elements in the linkedlist.
	 */
	public int count();
	
	/**
	 * Insert the value at the nth location, 0 being the head. 
	 * @param value
	 * @param location
	 * @return
	 */
	public int insertNth(int value,int location);
	
	/**
	 * Delete the entire linked list.
	 */
	public void deleteList();
	/**
	 * Given a linkedlist break it into 2 linkedlist such that 
	 * half the elements are in 1 and the other half is another. 
	 * 
	 * @return
	 */
	public MyLinkedList[] frontBackSplit();
	/**
	 * Remove duplicates in the list 
	 */
	public void removeDuplicates();
	/**
	 * Reverse a linkedlist. 
	 */
	public void reverse();
	/**
	 * Break the list into 2 such that all 
	 * odd location elements belong to 1 list 
	 * and even locations belong to another.  
	 * 
	 * @return
	 */
	public  MyLinkedList[]  alternateSplit();
	/**
	 * Given  2 sorted list - merge them to 1 single list.
	 * @param list
	 */
	public void mergeSort(MyLinkedList list);
	
	/**
	 * Given 2 sorted list build a list that contains the intersection  
	 * in that list. 
	 * @param list
	 * @return
	 */
	public MyLinkedList sortedIntersection(MyLinkedList list);
}
