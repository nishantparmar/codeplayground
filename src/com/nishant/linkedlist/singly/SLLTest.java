package com.nishant.linkedlist.singly;

public class SLLTest {
	/**
	 * Your MyLinkedList object will be instantiated and called as such:
	 * MyLinkedList obj = new MyLinkedList();
	 * int param_1 = obj.get(index);
	 * obj.addAtHead(val);
	 * obj.addAtTail(val);
	 * obj.addAtIndex(index,val);
	 * obj.deleteAtIndex(index);
	 */
	public static void main(String[] args) {
		
		//Create LL 9-->5-->4-->7
		Node head = new Node();
		head.val = 5;
		
		SinglyLinkedList ll= new SinglyLinkedList();
//		"addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"
//		[[],[1],[3],[1,2],[1],[1],[1]]
		
//		["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtHead","addAtTail","get","addAtHead","addAtIndex","addAtHead"]
//		[[],			[7],		[2],		[1],		[3,0],		[2],			[6],		[4],		[4],	[4],		[5,0],		[6]]
		
		ll.addAtHead(7); //7
		ll.addAtHead(2); //2-->7
		ll.addAtHead(1);// 1-->2-->7
		
		ll.addAtIndex(3, 0);//1-->2-->7
		
		ll.deleteAtIndex(2);//1-->2
//		ll.printNodes();

		ll.addAtHead(6);//6-->1-->2
//		ll.printNodes();
		
		ll.addAtTail(4);//6-->1-->2-->4
//		ll.printNodes();
		
		//System.out.println(ll.get(4));
		
		ll.addAtHead(4);
		
		ll.addAtIndex(5, 0);
		
		ll.addAtHead(6);
		ll.printNodes();
	}	
}
