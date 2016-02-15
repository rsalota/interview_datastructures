package com.seattletechinterviews.datastructures;

/**
 * Implement this interface and provide various readings of each operation.  
 *  
 * @author rsalota
 */
public interface CompareDS {

	/**
	 * Compare the run time of trying to find a value in a list and your hashtable.
	 * 
	 * @param list
	 * @param hashtable
	 * @param searchTree
	 * @param plainTree
	 * @param unbalancedTree
	 * @param value
	 */
	public void compareFind(MyLinkedList list, 
			MyHashtable hashtable,MyBinarySearchTree searchTree,MyTree plainTree,MyBinarySearchTree unbalancedTree, int value );
	
	/**
	 * Compare the run time of trying to add a value in a list and your hashtable.
	 * 
	 * @param list
	 * @param hashtable
	 * @param searchTree
	 * @param plainTree
	 * @param unbalancedTree
	 * @param value
	 */
	public void compareAdd(MyLinkedList list, 
			MyHashtable hashtable,MyBinarySearchTree searchTree,MyTree plainTree,MyBinarySearchTree unbalancedTree, int value );
	
}
