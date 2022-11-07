package linkedlist;

public class imple {
    class Node{
        int data;
        Node next;
        public Node(int data){//constructor
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add First----O(1)
    public void addFirst(int data){
        //step-1--create new node
        Node newNode=new Node(data);
        size++;

        if(head==null){//edge case
            head=tail=newNode;
            return;
        }

        //step-2
        newNode.next=head;//link a node

        //step -3
        head=newNode;


    }


    //add Last----O(1)
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }


    //PRINT a list----O(n)
    public void print(){
        if(head==null){
            System.out.print("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    //add in the middle=---O(n)
    public void add(int idx,int data){
        if(idx==0){//base
            addFirst(data);
            return;
        }

        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1,temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }


    //remove first
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }


    //remove last
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev:i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

        //iterative search
        public int itrSearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }

        //recursive search
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next, key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        }
        public int recSearch(int key){
            return helper(head, key);
        }

        //reverse
        public void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }



        //remove nth node from end
        public void deleteNthfromEnd(int n){
            //calculate size
            int sz=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                size++;

            }
            if(n==sz){
               head=head.next;//removefirst
               return;           
            }
            //sz-n
            int i=1;
            int iToFind=sz-n;
            Node prev=head;
            while(i<iToFind){
                prev=prev.next;
                i++;
            } 
            prev.next=prev.next.next;
            return;

        }
        public Node findMid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public boolean checkPAl(){
            if(head==null||head.next==null){
                return true;
            }
            //1
            Node midNode=findMid(head);
            //2
            Node prev=null;
            Node curr=midNode;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right=prev;//right half head
            Node left=head;
            //3
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;

            }
            return true;

        }
       



    public static void main(String args[]){
        imple ll=new imple();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
       
        ll.add(2, 3);
        ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // ll.addFirst(1);
        // ll.addLast(5);
        // ll.print();
        // System.out.println(ll.recSearch(3));
        // // ll.reverse();
        // ll.print();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
       
        // ll.add(2, 3);
        // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.print();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.checkPAl());
       
        
        
    }
    
}
