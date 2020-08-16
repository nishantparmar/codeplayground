package com.nishant.linkedlist.singly;

public class LLUtil {
	
	public static SinglyLinkedList buildLL() {
		SinglyLinkedList ll= new SinglyLinkedList();
		ll.addAtHead(7); //7
		ll.addAtHead(2); //2-->7
		ll.addAtIndex(3, 0);//1-->2-->7
		ll.addAtHead(6);//6-->1-->2
		ll.addAtTail(4);//6-->1-->2-->4
		ll.addAtIndex(5, 0);
		return ll;
	}
}
