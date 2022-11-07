package BST;

public class maxsumbst {//tc and sc=>>O(N)
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
    static class Info{
        int max;
        int min;
        boolean isBST;
        int sum;
        int currmax;
        Info(int m,int mi, boolean is,int su, int cur){
            max = m;
            min = mi;
            isBST = is;
            sum = su;
            currmax = cur;
        } 
        Info(){}
    }
    static class INT{
        int a;
    }
    static Info MaxSumBSTUtil(Node root,int maxsum){
        if(root==null){
            return new Info(Integer.MIN_VALUE,Integer.MAX_VALUE,true,0,0);
        }
        if(root.left==null&&root.right==null){
            maxsum.a=Math.max(maxsum.a,root.data);
        }
    }
}
