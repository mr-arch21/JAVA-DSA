package BST;
import java.util.*;
public class que {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left, val);
        }else{
            //rigth subtree
            root.right=insert(root.right, val);
        }
        return root;
    }
    //print in range
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1&&root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }
    //print root to leaf
    public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ->");
        }
        System.out.println("null");
    }
    public static void printroottoleaf(Node root,ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            printpath(path);
        }
        printroottoleaf(root.left, path);
        printroottoleaf(root.right,path);
        path.remove(path.size()-1);

    }
    
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null&&root.data<=min.data){
            return false;
        }else if(max!=null&&root.data>=max.data){
            return false;
        }
        return isValidBST(root.left, min, max)&&isValidBST(root.right, min, max);
    }


    //create mirror
    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftsubtree=createMirror(root.left);
        Node rightsubtree=createMirror(root.right);
        root.left=rightsubtree;
        root.right=leftsubtree;
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();
        printInRange(root,5, 12);
        System.out.println();
        printroottoleaf(root, new ArrayList<>());
        
        if(isValidBST(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }

        root=createMirror(root);
        preOrder(root);
    } 
}
