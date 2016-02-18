package com.seattletechinterviews.datastructures;

public interface MyLinkedList {
	
	//Add a value to the head of the linked list. @param value
	public void add(int value);
	
	// Remove the node at a particular location and return the value at that node. The node location start at 0 and 0 is 
	// the head. @param location
	public int removeAt(int location);
	
	// Append the value at the end of the linkedlist. @param value
	public void append(int value);
	
	// Count the total number of elements in the linkedlist.
	public int count();
	
	// Insert the value at the nth location, 0 being the head. @param value, @param location, @return
	public int insertNth(int value,int location);
	
	// Delete the entire linked list.
	public void deleteList();

	 // Given a linkedlist break it into 2 linkedlist such that half the elements are in 1 and the other half is another. @return
	public MyLinkedList[] frontBackSplit();
	
	// Remove duplicates in the list 
	public void removeDuplicates();
	
	// Reverse a linkedlist. 
	public void reverse();
	
	// Break the list into 2 such that all odd location elements belong to 1 list and even locations belong to another. @return
	public  MyLinkedList[]  alternateSplit();
	// Given  2 sorted list - merge them to 1 single list. @param list
	public void mergeSort(MyLinkedList list);
	
	// Given 2 sorted list build a list that contains the intersection in that list. @param list @return
	public MyLinkedList sortedIntersection(MyLinkedList list);
}

public class NoniLinkedList implements MyLinkedList {
	
	Node head;
	
	public static void main (String[] args){
		
		
	}

	private static class Node {
	 	int value;
	 	Node next;
	 	
	 	public Node(int value){
	 		this.value = value;
	}
	 
	// Add a value to the head of the linked list. @param value
	public void add(int value){
		head.value = value;
	}
	
	// Remove the node at a particular location and return the value at that node. The node location starts at 0 and 0 is the head. 
	// @param location
	public int removeAt(int location){
		Node previous = head;
		// index tracks location of each node
		int index = 0;
		// headMoved sets up the previous pointer
		int headMoved = 0;
		
		if (head == null){
			return null;
		}// if location is the first node
		else if (index == location){
			// reassign head to the 2nd node, thereby deleting the 1st
			Node tmp = head;
			head = head.next;
			return tmp.value;
		}
		// if location is in the rest of the nodes
		while (head.next != null){
			head = head.next;
			index++;
			headMoved++;
			if (headMoved >= 2){
				previous = previous.next;
			}
			if (index == location){
				// reassign the previous pointer, so it points to the head.next one (removing head node)
				if (head.next != null){
					previous.next = head.next;
					return head.value;
				} // else if location is the last node
				else if (head.next == null){
					previous.next = null;
					return head.value;
				}
			}
		}
	}
	
	// Append the value at the end of the linkedlist. @param value
	public void append(int value){
		Node n = head;
		Node end = new Node(value);
		
		if (head == null){
			return null;
		}
		while (n.next != null){
			n = n.next;	
		}
		// once n is n.next is null, add new node to end of list
		n.next = end;
		end.next = null;
	
	}
	
	// Count the total number of elements in the linkedlist.
	public int count(){
		// start at one, since start at head
		int counter = 1;
		while(head.next != null){
			head = head.next;
			counter++;
		}
		return counter;
	}
	
	// Insert the value at the nth location, 0 being the head. @param value @param location @return
	public int insertNth(int value, int location){
		Node tmp = head;
		// index keeps track of nodes
		int index = 0;
		if (head == null){
			return null;
		}
		while(tmp.next != null){
			if (index == location){
				tmp.value = value;
				return tmp.value;
			}
			// with each advancement in list, index iterates
			tmp = tmp.next;
			index++;
			// if last node is the location sought
			if (tmp.next == null && index == location){
				tmp.value = value;
				return tmp.value;
			}
		}
	}

	// Delete the entire linked list.
	public void deleteList(){
		// without the head, there is no list
		head.next = null;
		head.value = null;
		head = null;
	}
	
	// Given a linkedlist break it into 2 linkedlist such that. @return
	// assumes the given linked list is an even number of nodes
	public MyLinkedList[] frontBackSplit(){
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
	
	// Remove duplicates in the list 
	public void removeDuplicates(Node head){
		Node n = head;
		Node prev = head;
		int count = 0;
		HashSet hs = new HashSet();
		
		while(n.next != null){
			if (hs.contains(n.value){
				prev.next = n.next;
			}
			else {
				hs.add(n);
				n = n.next;
				count++;
				if (count >= 2){
					prev = prev.next;
				}
			}
		}
	}
	
	// Reverse a linkedlist. 
	public void reverse(){
		Node current = head;
		Node previous = null;
		Node nextNode;
		if (current == null || current.next == null){
			return null;
		}
		while (current != null){
			// assign the nextNode node
			nextNode = current.next;
			// then reverse head pointer to previous node
			current.next = previous;
			// reassign the nodes to iterate down the list
			previous = current;
			current = nextNode; 
		}
		// at end when current becomes null, the head is now the previous node
		head = previous;
	}

	// Break the list into 2 such that all odd location elements belong to 1 list and even locations belong to another. @return
	public  MyLinkedList[]  alternateSplit(){
		Node n = head;
		int count = 1;
		MyLinkedList[] finalList = new MyLinkedList[2];
		
		// get size of list
		while{n.next != null){
			n = n.next;
			count++;
		}
		// reassign n to beginning of linked list
		Node n = head;
		// create arrays for odd and even
		// sizing them as full length of list in case all are odd or all are even
		int arr[] arrOdd = new int[count];
		int arr[] arrEven = new int[count];
		
		// now iterate through to compare values in list then put into arrays
		for (int i = 0; i < count; i++) {
			if (n % 2 == 0){
				arrEven[i] = n;
				n = n.next;
			} else {
				arrOdd[i] = n;
				n = n.next;
			}
		}
		// add the lists to the MyLinkedList[]
		finalList[0] = arrEven;
		finalList[1] = arrOdd;
		
		return finalList;
	}
	
	// Given 2 sorted list - merge them to 1 single list. @param list
	public void mergeSort(MyLinkedList list){
		
	}
	
	// Given 2 sorted list build a list that contains the intersection in that list. @param list @return
	public MyLinkedList sortedIntersection(MyLinkedList list){
		
	}
}
