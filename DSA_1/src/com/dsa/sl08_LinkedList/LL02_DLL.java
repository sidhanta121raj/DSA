package com.dsa.sl08_LinkedList;

public class LL02_DLL {
	private Node head;

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}

		head = node;
	}
	
	public void insertLast(int value) {
		Node node = new Node(value);
		node.next = null;
		
		if(head == null) {
			node.prev = null;
			head = node;
			return;
		}
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		
		last.next = node;
		node.prev = last;
		
	}
	
	public void insert(int after, int value) {
		Node pos = find(after);
		
		if(pos == null) {
			 System.out.println("does not exist");
	         return;
		}
		
		Node node = new Node(value);
		node.next =  pos.next;;
		pos.next = node;
		node.prev = pos;
		if (node.next != null) {
            node.next.prev = node;
        }
		
	}
	
	public Node find(int value) {
		Node node = head;
		while (node != null) {
			if(node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	public void display() {
		Node node = head;
		Node last = null;
		while(node != null) {
			System.out.print(node.value+ "-->");
			last = node;
			node = node.next;
		}
		System.out.println("END");
		
		System.out.println("Print in Reverse");
		while(last != null) {
			System.out.print(last.value+ "-->");
			last = last.prev;
		}
		System.out.println("START");
		System.out.println("");
	}
	
	private class Node{
		private int value;
		private Node next;
		private Node prev;
		
		public Node(int value){
			this.value = value;
		}
		
	
	}

	public static void main(String[] args) {
      LL02_DLL list = new LL02_DLL();
      list.insertFirst(3);
      list.insertFirst(2);
      list.insertFirst(8);
      list.insertFirst(17);
      list.display();
      list.insertLast(99);
      list.display();
      list.insert(8, 65);
      list.display();
	}

}
