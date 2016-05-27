/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    if(a == null || a.next == null){
	        return null;
	    }
	    ListNode slow, fast;
	    slow = a;
	    fast = a;
	    boolean isCyclic = false;
	    while(fast.next != null && fast.next.next != null){
	        fast = fast.next.next;
	        slow = slow.next;
	        if(slow == fast){
	            isCyclic = true;
	            break;
	        }
	    }
	    if(!isCyclic){
	        return null;
	    } else {
	        slow = a;
	        while(slow != fast){
	            slow = slow.next;
	            fast = fast.next;
	        }
	        return slow;
	    }
	}
}
