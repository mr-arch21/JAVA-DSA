package binarytree;

public class imp {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //height
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    //count
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return leftCount+rightCount+1;
    }
    //sum of nodes
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.data;

    }
    //approach 1 for diameter=no.of nodes in the longest path between two nodes===>>>O(n*n)
    public static int dia1(Node root){
        if(root==null){
            return 0;
        }
        int leftDia=dia1(root.left);
        int lh=height(root.left);
        int rightDia=dia1(root.right);
        int rh=height(root.right);
        int selfDiam=lh+rh+1;
        return Math.max(selfDiam,Math.max(leftDia, rightDia));
    }
    //Approach 2===>>>O(n)
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info dia2(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=dia2(root.left);
        Info rightInfo=dia2(root.right);
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("the height of the tree "+ height(root));
        System.out.println("the total nodes:"+count(root));
        System.out.println("the sum of nodes:"+sum(root));
        System.out.println("the diameter is:"+dia1(root));
        System.out.println("the diameter is:"+dia2(root).diam);
    }
}
