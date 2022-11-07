package BST;


public class ksmallest{//O(N ) space=O(H)
     static class Node {
        int data;
        Node left,right;
        Node(int x){
            data=x;
            left=right=null;
        }
    }
   static int count=0;
   public static Node insert(Node root,int x){
        if(root==null){
            return new Node(x);
        }
        if(x<root.data){
            root.left=insert(root.left,x);
        }else if(x>root.data){
            root.right=insert(root.right,x);
        }
        return root;
   }
   public static Node kthsmallest(Node root,int k){
    if(root==null){
        return null;
    }
    Node left=kthsmallest(root.left, k);
    if(left!=null){
        return left;
    }
    count++;
    if(count==k){
        return root;
    }
    return kthsmallest(root.right, k);
   }
   public static void printksmallest(Node root,int k){
    Node res=kthsmallest(root,k);
    if(res==null){
        System.out.println("these are less tahn k nodes in the bst");

    }else{
        System.out.println("kth smallest element is "+res.data);
    }
   }
   public static void main(String args[]){
    Node root=null;
    int keys[]={20,8,22,4,12,10,14};
    for(int x:keys){
        root=insert(root,x);
    }
    int k=3;
    printksmallest(root, k);
   }
}
