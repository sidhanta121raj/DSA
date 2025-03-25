package com.dsa.sl08_LinkedList;

public class LL04_LLCycle {
	class ListNode {
	    int val;
	    ListNode next;

	    public ListNode() {
	    }

	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
	// https://leetcode.com/problems/linked-list-cycle
	 public boolean hasCycle(ListNode head) {
		 ListNode slow = head;
		 ListNode fast = head;
		 
		 while (fast != null && fast.next != null) {
			 fast = fast.next.next;
			 slow = slow.next;
			 if(fast == slow) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public int lengthOfCycle(ListNode head) {
		 ListNode slow = head;
		 ListNode fast = head;
		 
		 while (fast != null && fast.next != null) {
			 fast = fast.next.next;
			 slow = slow.next;
			 if(fast == slow) {
				 ListNode temp = slow;
				 int length = 0;
				 do {
					 temp = temp.next;
					 length++;
				 }while(temp != slow);
				 return length;
			 }
		 }
		 return 0;
	 }
	 
	 public ListNode startOfCycle(ListNode head) {
		 ListNode slow = head;
		 ListNode fast = head;
		 
		 while (fast != null && fast.next != null) {
			 fast = fast.next.next;
			 slow = slow.next;
			 if(fast == slow) {
				slow = head;
				while(fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return slow;
			 }
		 }
		 return null;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
