/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode rotateRight(ListNode a, int b) {
	    if(a == null){
	        return a;
	    }
	    int length = 0;
	    ListNode head = a;
	    while(head != null){
	        length += 1;
	        head = head.next;
	    }
	    if(b >= length){
	        b %= length;
	    }
	    if(b == 0){
	        return a;
	    }
	    int rotPos = length - b;
	    ListNode newHead = a;
	    ListNode prev = null;
	    int count = 0;
	    while(count < rotPos){
	        prev = newHead;
	        newHead = newHead.next;
	        count += 1;
	    }
	    if(prev != null){
	        prev.next = null;
	    }
	    ListNode connect = newHead;
	    while(connect.next != null){
	        connect = connect.next;
	    }
	    connect.next = a;
	    return newHead;
	}
}
