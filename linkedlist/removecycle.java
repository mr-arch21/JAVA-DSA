package linkedlist;

public class removecycle {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static boolean isCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void desroyCycle(Node head){
        //DETECT CYCLE
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle =true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //FIND MEETING POINT
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //REMOVE CYCLE
        prev.next=null;
        
    }
    public static void main (String args[]){
        removecycle ll=new removecycle();
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;
        System.out.println(isCycle(head));
        desroyCycle(head);
        System.out.println(isCycle(head));
    }
}
