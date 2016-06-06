/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    if(a == null && b == null){
	        return a;
	    }
	    if(a == null ){
	        return b;
	    } 
	    if(b == null){
	        return a;
	    }
	    ListNode aCurr = a;
	    ListNode bCurr = b;
	    ListNode resList = null;
	    ListNode track = null;
	    boolean carry = false;
	    while(aCurr != null && bCurr != null){
	        int add = aCurr.val + bCurr.val;
	        if(carry){
	            add += 1;
	            carry = false;
	        }
	        if(add >= 10){
	            carry = true;
	            add %= 10;
	        }
	        ListNode curValue = new ListNode(add);
	        if(resList == null){
	            resList = curValue;
	            track = resList;
	        } else {
	            track.next = curValue;
	            track = track.next;
	        }
	        aCurr = aCurr.next;
	        bCurr = bCurr.next;
	    }
	    if(aCurr != null){
	        while(aCurr != null){
	            if(carry){
	                int nextVal = aCurr.val + 1;
	                if(nextVal >= 10){
	                    carry = true;
	                    nextVal %= 10;
	                } else {
	                    carry = false;
	                }
	                track.next = new ListNode(nextVal);
	                track = track.next;
	            } else {
	                track.next = new ListNode(aCurr.val);
	                track = track.next;
	            }
	            aCurr = aCurr.next;
	        }
	    }
	    if(bCurr != null){
	        while(bCurr != null){
	            if(carry){
	                int nextVal = bCurr.val + 1;
	                if(nextVal >= 10){
	                    carry = true;
	                    nextVal %= 10;
	                } else {
	                    carry = false;
	                }
	                track.next = new ListNode(nextVal);
	                track = track.next;
	            } else {
	                track.next = new ListNode(bCurr.val);
	                track = track.next;
	            }
	            bCurr = bCurr.next;
	        }
	    }
	    if(carry){
	        track.next = new ListNode(1);
	        track = track.next;
	    }
	    return resList;
	}
}