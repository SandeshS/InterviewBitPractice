/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode B){
        if(B == null || B.next == null){
            return B;
        }
        ListNode prev = null;
        ListNode curr = B;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public int lPalin(ListNode A) {
        // Handle the edge case
        if(A == null || A.next == null){
            return 1;
        }
        // Find length of Linked list
        ListNode head = A;
        int count = 0;
        while(head != null){
            count += 1;
            head= head.next;
        }
        ListNode track = A;        
        int halfCount = 0;
        ListNode secHalf = null;
        while(track != null && halfCount < count/2){
            track = track.next;
            halfCount += 1;
        }
        if(count%2 == 1){
            track = track.next;
        } 
        secHalf = reverseList(track);
        //Now we have pointers to head of the list and second half. Compare first half elements
        ListNode firstHalf = A;
        int compCount = 0;
        while(compCount < count/2){
            if(firstHalf.val != secHalf.val){
                return 0;
            }
            compCount += 1;
            firstHalf = firstHalf.next;
            secHalf = secHalf.next;
        }
        return 1;
    }
}
