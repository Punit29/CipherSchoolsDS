package BinaryTree;

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

public class createBT {
    Node root;
    createBT(){
        root=null;
    }
    createBT(int data){
        this.root=new Node(data);
    }
    public static void main(String[] args) {
        createBT bt = new createBT(2);
        bt.root.left = new Node(3);
        bt.root.right=new Node(5);
        bt.root.left.right=new Node(3);
        bt.root.right.left= new Node(7);
    }
}
