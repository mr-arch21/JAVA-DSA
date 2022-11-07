package queue;

public class circularqueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return front==-1&&rear==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        //add
        public static void add(int data ){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            //add first element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result=arr[front];
            //last elem delete
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }   
     }
     public static void main(String args[]){
         Queue q1=new Queue(5);
         q1.add(1);
         q1.add(2);
         q1.add(3);
         System.out.println(q1.remove());
         q1.add(4);
         System.out.println(q1.remove());
         q1.add(5);
        //  while(!q1.isEmpty()){
        //     System.out.println(q1.peek());
        //     q1.remove();
        //  }
     }
    
}
