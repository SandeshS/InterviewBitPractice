/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
	    // Handle edge case when no element/one element present in List
	    if(a == null || a.next == null){
	        return a;
	    }
	    // Now to handle duplicates
	    ListNode head = a;
	    ListNode prev = null;
	    ListNode newHead = null;
	    while(head != null){
	        boolean foundDup = false;
	        while(head.next != null && head.next.val == head.val){
	            foundDup = true;
	            head.next = head.next.next;
	        }
	        if(foundDup){
	            head = head.next;
	        } else {
	            if(prev == null){
	                prev = head;
	                newHead = prev;
	                head = head.next;
	            } else {
	                prev.next = head;
	                head = head.next;
	                prev = prev.next;
	            }
	        }
	    }
	    if(prev != null){
	        prev.next = null;
	    }
	    return newHead;
	}
}