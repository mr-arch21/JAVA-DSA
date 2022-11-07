package HAshing;
import java.util.*;
public class bottomview {
    static class Node{
        int data;
        int hd;
        Node left,right;
        public Node (int key){
            this.data=key;
            this.hd=Integer.MAX_VALUE;
            this.left=this.right=null;
        }
    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void bottomView(Node root){
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
           
                map.put(curr.hd,curr.node);
            
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();

    }
    
    public static void main(String args[]){
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(22);
        root.left.left=new Node(5);
        root.left.right=new Node(3);
        root.right.right=new Node(25);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(14);
        bottomView(root);
   } 
}
