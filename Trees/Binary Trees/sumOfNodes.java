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


public class sumOfNodes {
    Node root;
    sumOfNodes(){
        root=null;
    }
    sumOfNodes(int data){
        this.root=new Node(data);
    }
        public static void main(String[] args) {
            sumOfNodes bt = new sumOfNodes(2);
            bt.root.left = new Node(3);
            bt.root.right = new Node(5);
            bt.root.left.right = new Node(9);
            bt.root.right.left = new Node(7);
            System.out.println(bt.treeSum(bt.root));
        }

        int treeSum(Node root){
            if(root==null)return 0;
            return root.data+treeSum(root.left)+treeSum(root.right);
        }
}
