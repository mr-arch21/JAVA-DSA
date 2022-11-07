package BST;
import java.util.*;
public class rangesumofbst {//time and space=o(n)
    static class Node{
        int val;
        Node left,right;
    }
    static Node newNode(int item){
        Node temp=new Node();
        temp.val=item;
        temp.left=temp.right=null;
        return temp;
    }
    static int sum=0;
    static int rangesumbst(Node root,int low,int high){
        if(root==null){
            return 0;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr=q.peek();
            q.remove();
            if(curr.val>=low&&curr.val<=high){
                sum+=curr.val;
            }
            if(curr.left!=null&&curr.val>low){
                q.add(curr.left);
            }
            if(curr.right!=null&&curr.val<high){
                q.add(curr.right);
            }
        }
        return sum;
    }
    static Node insert(Node node,int data){
        if(node ==null){
            return newNode(data);

        }
        if(data<=node.val){
            node.left=insert(node.left,data);
        }else{
            node.right=insert(node.right,data);
        }
        return node;
    }
    public static void main(String args[]){
        Node root=null;
        root=insert(root,10);
        insert(root,5);
        insert(root,15);
        insert(root,3);
        insert(root,7);
        insert(root,18);
        int l=7,r=15;
        System.out.print(rangesumbst(root,l,r));

    }
}
