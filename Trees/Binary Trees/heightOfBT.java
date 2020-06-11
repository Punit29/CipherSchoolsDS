/*package BinaryTree;

class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}

public class heightOfBT {
    Node root;
    heightOfBT(){
        root=null;
    }
    heightOfBT(int data){
        this.root=new Node(data);
    }

    public static void main(String[] args) {
        heightOfBT bt = new heightOfBT(2);
        bt.root.left = new Node(3);
        bt.root.right = new Node(5);
        bt.root.left.right = new Node(9);
        bt.root.right.left = new Node(7);
        bt.root.right.left.right = new Node(10);
        System.out.println(bt.treeHeight(bt.root));
    }

    int treeHeight(Node root){
        if(root==null)return -1;
        return 1+Math.max(treeHeight(root.left),treeHeight(root.right));
    }
}
*/