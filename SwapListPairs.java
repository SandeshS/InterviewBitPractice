/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode swapPairs(ListNode a) {
	    if(a == null){
	        return a;
	    }
	    if(a.next == null){
	        return a;
	    }
	    // handled edge cases. Now to do pairwise swaps
	    ListNode cur = a;
	    ListNode adj = a.next;
	    ListNode prev = null;
	    while(cur != null && adj != null){
	        if(cur == a){
	            ListNode temp = adj.next;
	            cur.next = temp;
	            adj.next = cur;
	            prev = cur;
	            a = adj;
	        } else {
	            ListNode temp = adj.next;
	            cur.next = temp;
	            adj.next = cur;
	            prev.next = adj;
	            prev = cur;
	        }
	        cur = cur.next;
	        if(cur != null){
	            adj = cur.next;
	        }
	    }
	    return a;
	}
}
