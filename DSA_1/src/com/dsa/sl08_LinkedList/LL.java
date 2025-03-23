package com.dsa.sl08_LinkedList;

public class LL {
	private Node head;
	private Node tail;
	private int size;
	
	
	public LL() {
		this.size = 0;
	}
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = node;
		}
		size = size + 1;
	}
	
	public void insertLast(int value) {
		if(tail == null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		
		
		size = size + 1;
	}
	
	public void insert(int value, int index) {
		if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

		Node temp = head;
		for(int i=0; i<index; i++) {
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;
		size = size + 1;
	}
	
	public void deleteFirst() {
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size = size - 1;
	}
	
	public void deleteLast() {
		 if (size <= 1) {
	            deleteFirst();
	        }
		Node secondLast = get(size-2);
		tail = secondLast;
		tail.next = null;
		size = size - 1;
	}
	
	public void delete(int index) {
		if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }
		Node pvs = get(index-1);
		pvs.next = pvs.next.next;
		size--;
	}
	
	public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

	public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
	
	public void display() {
		Node node = head;
		while(node != null) {
			System.out.print(node.value+ "-->");
			node = node.next;
		}
		System.out.println("END");
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value){
			this.value = value;
		}
		
		public Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
       
	}

}
