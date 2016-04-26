/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int getLength(ListNode a){
        int counter = 0;
        while(a != null){
            counter += 1;
            a = a.next;
        }
        return counter;
    }
    
	public ListNode removeNthFromEnd(ListNode a, int b) {
	    int len = getLength(a);
	    if(len == 0){
	        return null;
	    }
	    if(b > len){
	        return a.next;
	    }
	    ListNode nthToLast = null;
	    ListNode track = null;
	    ListNode fast = a;
	    int i = 1;
	    while(i<b){
	        i += 1;
	        fast = fast.next;
	    }
	    nthToLast = a;
	    while(fast != null && fast.next != null){
	        fast = fast.next;
	        track = nthToLast;
	        nthToLast = nthToLast.next;
	    }
	    if(track == null){
	        return nthToLast.next;
	    }
	    track.next = nthToLast.next;
	    return a;
	}
}
