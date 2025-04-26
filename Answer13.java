//merge two sorted linked lists into one sorted list

public class Answer13 {
    //TC:O(N+M) SC:O(1)
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node mergeTwoSortedLL(Node list1, Node list2){
        Node dummyNode= new Node(-1);
        Node current=dummyNode;

        while(list1!=null && list2!=null){
            if(list1.data<=list2.data){
                current.next=list1;
                list1=list1.next;
            }else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }

        if(list1!=null){
            current.next=list1;
        }else{
            current.next=list2;
        }
        return dummyNode.next;
    }

    static Node createLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    static void printLL(Node head) {
        while (head.next != null) {
          System.out.print(head.data + "->");
          head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        int[] list1Arr = {1, 3, 5, 7};
        int[] list2Arr = {2, 4, 6, 8};

        Node list1 = createLL(list1Arr);
        Node list2 = createLL(list2Arr);

        System.out.println("List 1:");
        printLL(list1);

        System.out.println("List 2:");
        printLL(list2);

        Node mergedList = mergeTwoSortedLL(list1, list2);

        System.out.println("Merged List:");
        printLL(mergedList);
    }
}
