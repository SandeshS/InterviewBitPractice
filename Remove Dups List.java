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
	    if(a == null){
	        return null;
	    }
	    ListNode head = a;
	    ListNode curr = a;
	    while(curr!= null){
	        ListNode temp = curr.next;
	        while(temp!=null && (temp.val == curr.val)){
	            temp = temp.next;
	        }
	        curr.next = temp;
	        curr = temp;
	    }
	    return a;
	}
}
