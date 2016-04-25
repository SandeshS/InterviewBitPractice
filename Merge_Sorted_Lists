/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	    if(a == null && b == null){
	        return null;
	    }
	    if(a == null && b != null){
	        return b;
	    }
	    if(a != null && b == null){
	        return a;
	    }
	    ListNode res = null;
	    ListNode head = null;
	    while(a != null && b != null){
	        if(res == null){
	            if(a.val <= b.val){
	                res = new ListNode(a.val);
	                a = a.next;
	            } else {
	                res = new ListNode(b.val);
	                b = b.next;
	            }
	            head = res;
	            res.next = null;
	        } else {
	            if(a.val <= b.val){
	                res.next = new ListNode(a.val);
	                res = res.next;
	                a = a.next;
	            } else {
	                res.next = new ListNode(b.val);
	                res = res.next;
	                b = b.next;
	            }
	        }
	    }
	    while(a!=null){
	        res.next = new ListNode(a.val);
	        res = res.next;
	        a = a.next;
	    }
	    while(b!=null){
	        res.next = new ListNode(b.val);
	        res = res.next;
	        b = b.next;
	    }
	    return head;
	}
}
