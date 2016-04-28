/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    if(a == null){
	        return null; //corner case 1
	    }
	    if(m > n){
	        return null; // corner case 2
	    }
	    if(m == n){
	        return a; //corner case 3
	    }
	    // now for some computation
	    ListNode tHead = null;
	    ListNode oldPrev = null;
	    int i = 1;
	    tHead = a;
	    while(i < m){
	        oldPrev = tHead;
	        tHead = tHead.next;
	        i += 1;
	    }
	    //if oldPrev is NULL, it means m is 1 - need to check this
	    ListNode tTail = null;
	    ListNode oldNext = null;
	    tTail = a;
	    for(int j = 1; j<n; j++){
	        tTail = tTail.next;
	    }
	    oldNext = tTail.next; // might be null
	    // now tHead to tTail constitutes a Linked List which needs to be reversed.
	    ListNode current = tHead;
	    ListNode prev = oldNext;
	    while(current != tTail){
	        ListNode temp = current.next;
	        current.next = prev;
	        prev = current;
	        current = temp;
	    }
	    current.next = prev;
	    if(oldPrev == null){
	        return current;
	    } else {
	        oldPrev.next = current;
	    }
	    return a;
	}
}
