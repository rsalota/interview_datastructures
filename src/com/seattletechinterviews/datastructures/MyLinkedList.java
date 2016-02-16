package com.seattletechinterviews.datastructures;

public interface MyLinkedList {

	 class Node {
	 	int value;
	 	Node next;
	 	
	 	public Node (int value){
	 		this.value = value;
	 	}
	 }
	 /**
	 * Add a value to the head of the linked list.
	 * @param value
	 */
	public void add(Node head, int value){
	
		head.value = value;
	};
	
	/**
	 * Remove the node at a particular location and return the 
	 * value at that node. The node location start at 0 and 0 is 
	 * the head. 
	 * @param location
	 */
	public int removeAt(Node head, int location){
		Node previous = head;
		int headMoved = 0;
		if (head == null){
			return null;
		}// if location is the first node
		else if (head.value == location){
			return head.value;
		}
		// if location is in the middle
		while (head.next != null){
			head = head.next;
			headMoved++;
			if (headMoved >= 2){
				previous = previous.next;
			}
			if (head.value == location){
				previous.next = head.next;
				return head.value;
			}
		}
		// if location is the last node
		if (head.next == null && head.value == location){
			previous.next = null;
			return previous.value;
		}
	}
	
	/**
	 * Append the value at the end of the linkedlist.
	 * @param value
	 */
	public void append(Node head, int value){
		Head tmp = head;
		Node end = new Node(value);
		// assign value to a new node
		end.value = value;
		if (head == null){
			return null;
		}
		while (tmp.next != null){
			tmp = tmp.next;	
		}
		// add new node to end of list
		if (tmp.next == null){
			tmp.next = end;
			end.next = null;
		}
	}
	
	/**
	 * Count the total number of elements in the linkedlist.
	 */
	public int count(Node head){
		// start at one, since start at head
		int counter = 1;
		while(head.next != null){
			head = head.next;
			counter++;
		}
		return counter;
	}
	
	/**
	 * Insert the value at the nth location, 0 being the head. 
	 * @param value
	 * @param location
	 * @return
	 */
	 // Return the node.value? I'm assuming that.
	public int insertNth(int value, int location, Node head){
		if (head == null){
			return null;
		}
		Node tmp = head;
		// need to count locations as we go
		// starting with 0 as head
		int counter = 0;
		while(tmp.next != null){
			if (counter == location){
				tmp.value = value;
				return tmp.value;
			}
			// with each advancement, counter iterates
			tmp = tmp.next;
			counter++;
			// if last node is the location sought
			if (tmp.next == null && counter == location){
				tmp.value = value;
				return tmp.value;
			}
		}
	}
	/**
	 * Delete the entire linked list.
	 */
	public void deleteList(Node head){
		// without the head, there is no list
		head.next = null;
		head.value = null;
		head = null;
	}
	
	/**
	 * Given a linkedlist break it into 2 linkedlist such that 
	 * half the elements are in 1 and the other half is another. 
	 * 
	 * @return
	 */
	 // assumes the given linked list is an even number of nodes
	public MyLinkedList[] frontBackSplit(Node head){
		if (head == null){
			return null;
		}
		Node start = head;
		Node tmp = head;
		int count = 0;
		
		// count the nodes
		while (tmp.next != null){
			tmp = tmp.next;
			count++;
		}
		// once you reach the end, advance the start (count/2) times
		// and put each node value into first array 
		int[] arr1 = new int[count/2];
		for (int i = 0; i <= count/2; i++){
			arr1[i] = start.value;
			if (start.next != null){
				start = start.next;
			}
		}
		// now put remaining list into 2nd array
		int[] arr2 = new int[count/2];
		for (int j = 0; j <= count/2; j++){
			arr2[j] = start.value;
			if (start.next != null){
				start = start.next;
			}
		}
		// add 2 arrays to the MyLinkedList[]
		MyLinkedList[] finalArray = {arr1, arr2};
		
		return finalArray;
	}
	
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
