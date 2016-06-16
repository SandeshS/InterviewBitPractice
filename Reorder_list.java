/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    // This function reverses second half of the Linked List
    public ListNode reverseSecHalf(ListNode b){
        if(b == null || b.next == null){
            return b;
        }
        ListNode prev = null;
        ListNode cur = b;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
    
	public ListNode reorderList(ListNode a) {
	    if(a == null || a.next == null || a.next.next == null){
	        return a;
	    }
	    int length = 0;
	    ListNode lenList = a;
	    while(lenList != null){
	        length += 1;
	        lenList = lenList.next;
	    }
	    // we need to reverse the second half of the list
	    ListNode secHalf = a;
	    ListNode prev = null;
	    for(int i = 0; i<length/2; i++){
	        prev = secHalf;
	        secHalf = secHalf.next;
	    }
	    if(length%2 == 1){
	        prev = secHalf;
	        secHalf = secHalf.next;
	    }
	    prev.next = reverseSecHalf(secHalf);
	    ListNode headTrack = a;
	    ListNode fh = a;
	    ListNode sh = prev.next;
	    ListNode shTrack = prev.next;
	    while(fh != null && sh != null){
	        ListNode fhTemp = fh.next;
	        ListNode shTemp = sh.next;
	        if(fhTemp == shTrack){
	            fhTemp = null;
	        }
	        fh.next = sh;
	        sh.next = fhTemp;
	        fh = fhTemp;
	        sh = shTemp;
	    }
	    if(fh != null){
	        fh.next = null;
	    }
	    return headTrack;
	}
}
