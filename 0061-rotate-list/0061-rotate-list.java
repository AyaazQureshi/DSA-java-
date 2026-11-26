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
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         ListNode temp = head;
//         ListNode tail = null;
//         //edge cse
//         if(head==null || head.next==null) return head;
//         int n=0;
//         while(temp!=null){
//             if(temp.next==null) tail=temp;
//             temp = temp.next;
//             n++; //n >> length h
//         }
//         k = k%n;
//         if(k==0) return head;  
//         temp=head;
//         for(int i=1;i<=n-k-1;i++){
//             temp = temp.next;
//         }
        
//         tail.next = head;
//         head = temp.next;
//         temp.next = null;
//         return head;
//     }
// }


class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int n=1;
          if (head == null || head.next == null || k == 0) return head;  //
       
          ListNode t = head;
             while(t.next!=null){
            t = t.next;
            n++; //n >> length h
        }
                  
               k = k%n;
               if(k==0) return head;
               
       ListNode slow=head;
        ListNode fast=head;
        
       
        for(int i=1;i<=k+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
         ListNode a = slow.next;
         slow.next=null;
        // ListNode temp = a;
        
        // while(temp.next!=null){
        //     temp = temp.next;
        // }
        t.next= head;


       return a;
    }
}