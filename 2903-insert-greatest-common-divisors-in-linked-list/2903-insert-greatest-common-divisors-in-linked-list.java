/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static int gcd(int n1, int n2){
        while(n1!=n2){  
            if(n1>n2) n1=n1-n2;  
            else n2=n2-n1;  
        }
        return n2;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;

        while(temp.next != null){
            int data = gcd(temp.val, temp.next.val);
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        return head;
    }
}