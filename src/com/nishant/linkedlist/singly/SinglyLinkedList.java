package com.nishant.linkedlist.singly;

class ListNode {
	int data;
	ListNode nextNode;

	@Override
	public String toString() {
		return "ListNode [data=" + data + ", nextNode=" + nextNode + "]";
	}
}


public class SinglyLinkedList {
	public ListNode head;

	/** Initialize your data structure here. */
	public SinglyLinkedList() {
	}

	/**
	 * Get the value of the index-th ListNode in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		int i = 0;
		ListNode currentNode = head;
		while (i <= index) {
			if (i == index) {
				return currentNode.data;
			}
			currentNode = currentNode.nextNode;
			
			if(currentNode == null) {
				
				break;
			}
			i++;
		}
		return -1;
	}
	
	/**
	 * Get the ListNode of the index-th ListNode in the linked list. If the index is
	 * invalid, return null.
	 */
	public ListNode getNode(int index) {
		int i = 0;
		ListNode currentNode = head;
		while (i <= index) {
			if (i == index) {
				return currentNode;
			}
			currentNode = currentNode.nextNode;
			i++;
		}
		return null;
	}
	
	public int size() {
		int i = 0;
		ListNode currentNode = head;
		while (currentNode != null) {
			i++;
		}
		return i;
	}
	

	/**
	 * Add a ListNode of value val before the first element of the linked list. After
	 * the insertion, the new ListNode will be the first ListNode of the linked list.
	 */
	public void addAtHead(int val) {
		ListNode newHead = new ListNode();
		newHead.data = val;
		newHead.nextNode = head;
		head = newHead;
	}

	/** Append a ListNode of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		ListNode newTail = new ListNode();
		newTail.data = val;

		if(head.nextNode == null) {
			head.nextNode = newTail;
			return;
		}
		
		ListNode currentNode = head;
		while (head.nextNode != null) {
			if(currentNode.nextNode == null) {
				currentNode.nextNode = newTail;
				break;
			}
			currentNode = currentNode.nextNode;
		}

	}

	/**
	 * Add a ListNode of value val before the index-th ListNode in the linked list. If index
	 * equals to the length of linked list, the ListNode will be appended to the end of
	 * linked list. If index is greater than the length, the ListNode will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		
		ListNode aNode = new ListNode();
		aNode.data = val;

		if(index ==0) {
			aNode.nextNode = head;	
			head = aNode;
			return;
		}
		
		if(head.nextNode == null) {
			head.nextNode = aNode;
		}
		
		ListNode currentNode = head;
		ListNode prevNode = null;
		int i = 0;
		while (currentNode != null) {
			if(i == index) {
				aNode.nextNode = currentNode;
				prevNode.nextNode = aNode;
				currentNode = aNode;
				break;
			}
			prevNode = currentNode;
			currentNode = currentNode.nextNode;
			i++;
		}
	}

	/** Delete the index-th ListNode in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if(index ==0) {
			head = head.nextNode;	
			return;
		}
		
		ListNode currentNode = head;
		ListNode prevNode = null;
		int i = 0;
		while (currentNode != null) {
			if(i == 0) {
				
			}
			if(i == index) {
				prevNode.nextNode = currentNode.nextNode;
				break;
			}
			prevNode = currentNode;
			currentNode = currentNode.nextNode;
			i++;
		}
	}

	public void printNodes() {
//		ListNode currentNode = head;
//		while (currentNode != null) {
//			currentNode = currentNode.nextNode;
//			//System.out.println(currentNode.data);
//		}
		System.out.println(head);
	}

}
