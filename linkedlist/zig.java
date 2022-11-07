package linkedlist;



public class zig {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void zigzag(Node head){
        //find mid
        Node slow=head;
        Node fast=head.next;//for find mid in even case
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        //alt merge
        while(left!=null&&right!=null){
            //zigzag
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            //update
            left=nextL;
            right=nextR;

        }

    }
    public void printList(Node head){
        Node tNode = head;
        while (tNode != null) {
        System.out.print(tNode.data + " ");
        tNode = tNode.next;
        }
     }
     public static void main(String args[]){
        zig ll=new zig();
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        ll.printList(head);
        System.out.println();
        ll.zigzag(head);
        ll.printList(head);
     }
}
