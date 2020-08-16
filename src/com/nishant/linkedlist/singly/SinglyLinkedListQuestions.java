package com.nishant.linkedlist.singly;

public class SinglyLinkedListQuestions {

	public static void main(String[] args) {

		// Create LL 6-->2-->7-->4
		SinglyLinkedList ll = LLUtil.buildLL();
		ll.printNodes();

		// IN: 6-->2-->7-->4
		// OUT:6-->7-->2-->4
		// suffleLinkedList(ll, 7, 1);

		ListNode n = reverseList(ll.head);
		ll.head = n;
		ll.printNodes();
	}

	static void suffleLinkedList(SinglyLinkedList ll, int toMove, int index) {

		ListNode currentNode = ll.head;

		int i = 0;

		ListNode ithNode = null;

		while (currentNode.nextNode != null) {

			if (currentNode.data == toMove) {

			}

			if (i == index) {
				ithNode = currentNode;

			}

			currentNode = currentNode.nextNode;
			i++;
		}
	}

	// 1-->2-->3
	static ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}

		if (head.nextNode == null) {
			return head;
		}

		ListNode prevNode = null;
		ListNode currentNode = head;
		ListNode nextNode = head.nextNode;

		ListNode tail = null;
		
		while (currentNode.nextNode != null) {
			if (prevNode == null) {
				tail = currentNode;
			}
			if (prevNode != null) {
				currentNode.nextNode = prevNode;
				prevNode.nextNode = nextNode;
			}else {
				
			}
			currentNode = currentNode.nextNode;
		}

		return currentNode;
	}
}
