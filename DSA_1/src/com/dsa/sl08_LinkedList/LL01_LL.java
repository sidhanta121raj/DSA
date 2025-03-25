package com.dsa.sl08_LinkedList;

public class LL01_LL {
	private Node head;
	private Node tail;
	private int size;
	
	
	public LL01_LL() {
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
	
	public void insertRec(int value, int index) {
		head = insertRec(value, index, head);
	}
	
	private Node insertRec(int value, int index, Node node) {
		if(index == 0) {
			Node temp = new Node(value, node);
            size++;
            return temp;
		}
		
		node.next = insertRec(value, index-1, node.next);
		return node;
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
	public void removeDuplicatesInSortedList() {
		Node node = head;
		while(node.next != null) {
			if(node.value == node.next.value) {
				node.next = node.next.next;
				size--;
			}else {
				node = node.next;
			}
		}
		tail = node;
		tail.next = null;
	}
	
	public static LL01_LL mergeSortedLists(LL01_LL first, LL01_LL second) {
		Node node1 = first.head;
		Node node2 = second.head;
		LL01_LL res = new LL01_LL();
		while(node1 != null && node2 != null) {
			if(node1.value <= node2.value) {
				res.insertLast(node1.value);
				node1 = node1.next;
			}else {
				res.insertLast(node2.value);
				node2 = node2.next;
			}
		}
		
		while(node1 != null) {
			res.insertLast(node1.value);
			node1 = node1.next;
		}
		
		while(node2 != null) {
			res.insertLast(node2.value);
			node2 = node2.next;
		}
		return res;
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
		LL01_LL list = new LL01_LL();
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
        list.insertRec(88, 2);
        list.display();
        
        LL01_LL list1 = new LL01_LL();
        list1.insertLast(1);
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(3);
        list1.insertLast(3);
        list1.display();
        list1.removeDuplicatesInSortedList();
        list1.display();
        
        LL01_LL first = new LL01_LL();
        LL01_LL second = new LL01_LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL01_LL ans = LL01_LL.mergeSortedLists(first, second);
        ans.display();
       
	}

}
