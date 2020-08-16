package com.nishant.linkedlist.doubly;

public class DLLTest {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		//Create DLL
		Node head = new Node(1);
		dll.setHead(head);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		dll.setTail(n4);
		dll.insertAfter(head, n1);
		dll.insertAfter(n1, n2);
		dll.insertAfter(n2, n3);
		System.out.println("Given DLL"); 
		dll.display();
		
		//Stand-alone nodes
		Node sn1 = new Node(3);
		Node sn2 = new Node(3);
		Node sn3 = new Node(6);
		
		System.out.println("setHead(4)"); 
		dll.setHead(n3);
		dll.display();
		
		System.out.println("setTail(6)"); 
		dll.setTail(sn3);
		dll.display();
		
		System.out.println("insertBefore(6,3)"); 
		dll.insertBefore(sn3, n2);
		dll.display();
		
		System.out.println("insertAfter(6,3)"); 
		dll.insertAfter(sn3, sn2);
		dll.display();
		
		System.out.println("removeNodesWithValue(3)"); 
		dll.removeNodesWithValue(3);
		dll.display();
//		
//		System.out.println("insertAtPosition(1,3)"); 
		//dll.insertAtPosition(1, n33);
		//dll.display();
		
	}

}
