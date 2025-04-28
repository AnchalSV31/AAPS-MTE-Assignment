//. Remove the n-th node from the end of a singly linked list

public class Answer26 {
    //TC:O(N) SC:O(1)
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode removeNthNode(ListNode head, int n){
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0; i<n; i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        ListNode delNode=slow.next;
        slow.next=slow.next.next;
        delNode.next=null;
        return head;
    }

     public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);
        head.next.next.next.next = new ListNode(arr[4]);

        //head = DeleteNthNodefromEnd(head, N);
        head = removeNthNode(head, N);
        printLL(head);
    }

}
