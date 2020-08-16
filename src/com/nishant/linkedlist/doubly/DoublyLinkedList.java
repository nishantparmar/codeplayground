package com.nishant.linkedlist.doubly;

class Node {
	int value;
	Node prev;
	Node next;
	public Node(int value) {
	      this.value = value;
	    }
}

public class DoublyLinkedList {
	public Node head;
    public Node tail;

    //4,1,2,3,5
    public void setHead(Node node) {
      if(head == null) {
    	head = node;
      }else {
    	  
    	Node currentNode = head;
  		while (currentNode != null) {
  			if (currentNode.value == node.value) {
  				currentNode.prev.next = currentNode.next;
  				break;
  			}
  			currentNode = currentNode.next;
  		}
    	  
    	  node.next = head;
    	  head.prev = node;
    	  //new head
    	  head = node;
      }
    }

	public void setTail(Node node) {

		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.next == null) {
				currentNode.next = node;
				node.prev = currentNode;
				break;
			}
			currentNode = currentNode.next;
		}
	}

		//4 1 2 3 5 6 
    public void insertBefore(Node node, Node nodeToInsert) {
    	
    	remove(nodeToInsert);
    	//4 1 2 5 6
    	display();
    	Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.value == node.value) {
				currentNode.prev.next = nodeToInsert;
				currentNode.prev = nodeToInsert;
				nodeToInsert.next = currentNode;
				nodeToInsert.prev = currentNode.prev;
				break;				
			}
			currentNode = currentNode.next;
		}
    }

    public void insertAfter(Node node, Node nodeToInsert) {
    	Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.value == node.value) {
				nodeToInsert.next = currentNode.next;
				currentNode.next = nodeToInsert;
				nodeToInsert.prev = currentNode;
				break;
			}
			currentNode = currentNode.next;
		}
    }

    public void insertAtPosition(int position, Node nodeToInsert) {
    	Node currentNode = head;
    	int index = 1;
		while (currentNode != null) {
			if(index == position) {
				nodeToInsert.next = currentNode.next;
				nodeToInsert.prev =currentNode.prev;
				break;
			}
			currentNode = currentNode.next;
			index++;
		}
    }

    public void removeNodesWithValue(int value) {
    	Node currentNode = head;
		while (currentNode != null) {
			if(currentNode.value == value) {
				currentNode.prev = currentNode.next;
				currentNode.next = currentNode.prev;
			}
			currentNode = currentNode.next;
		}
    }

    public void remove(Node node) {
    	Node currentNode = head;
		while (currentNode != null) {
			if(currentNode.value == node.value) {
				currentNode.prev.next = currentNode.next;
			}
			currentNode = currentNode.next;
		}
    }

    public boolean containsNodeWithValue(int value) {
    	Node currentNode = head;
		while (currentNode != null) {
			if(currentNode.value == value) {
				return true;
			}
			currentNode = currentNode.next;
		}
      return false;
    }
    
    
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        } 
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
            System.out.print(current.value + " ");  
            current = current.next;  
        }
        System.out.println("");
    }  
}
