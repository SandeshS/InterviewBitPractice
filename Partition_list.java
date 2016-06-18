/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode partition(ListNode a, int b) {
	    if(a == null || a.next == null){
	        return a;
	    }
	    ListNode ltb = null;
	    ListNode ltbTrack = null;
	    ListNode relOrder = null;
	    ListNode relTrack = null;
	    ListNode cur = a;
	    while(cur != null){
	        ListNode temp = cur.next;
	        if(cur.val < b){
	            if(ltb == null){
	                ltb = cur;
	                ltb.next = null;
	                ltbTrack = ltb;
	            } else {
	                ltbTrack.next = cur;
	                ltbTrack = ltbTrack.next;
	                ltbTrack.next = null;
	            }
	        } else {
	            if(relOrder == null){
	                relOrder = cur;
	                relOrder.next = null;
	                relTrack = relOrder;
	            } else {
	                relTrack.next = cur;
	                relTrack = relTrack.next;
	                relTrack.next = null;
	            }
	        }
	        cur = temp;
	    }
	    // Handles the case when there are no elements < b
	    if(ltbTrack!= null){
	        ltbTrack.next = relOrder;
	        return ltb;
	    } else {
	        return relOrder;
	    }
	}
}
