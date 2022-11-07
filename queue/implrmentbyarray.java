package queue;

public class implrmentbyarray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
             Queue(int n ){
                arr=new int[n];
                size=n;
                rear=-1;
            }
        
     public static boolean isEmpty(){
        return rear==-1;
     }
     //add
     public static void add(int data){
        if(rear==size-1){
            System.out.println("queue is full");
            return ;
        }
        rear=rear+1;
        arr[rear]=data;
     }
     //remove
     public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front =arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
     }
     //peek
     public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[0];
     }
    }

        public static void main (String args[]){
            Queue q1=new Queue(3);
            q1.add(1);
            q1.add(2);
            q1.add(3);
            while(!q1.isEmpty()){
                System.out.println(q1.peek());
                q1.remove();
            }

    }
}

