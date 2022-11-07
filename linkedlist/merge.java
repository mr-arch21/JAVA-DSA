package linkedlist;

public class merge {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public Node mergeSort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        //FIND MID
        Node mid=getMid(head);
        //LEFT &RIGHT MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
    }
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;//for find mid in even case
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next; 
        }
        return mergedLL.next;
    }
    public void printList(Node head){
        Node tNode = head;
        while (tNode != null) {
        System.out.print(tNode.data + " ");
        tNode = tNode.next;
        }
     }

    public static void main(String args[]){
        merge ll=new merge();
        Node head=new Node(3);
        head.next=new Node(1);
        head.next.next=new Node(7);
        head.next.next.next=new Node(5);
        ll.printList(head);
        System.out.println();
        head=ll.mergeSort(head);
        ll.printList(head);
        
    }
}
