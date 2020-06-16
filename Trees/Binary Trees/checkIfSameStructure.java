package BinaryTree;

class  Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}


public class checkIfSameStructure {
    Node root;
    checkIfSameStructure(){
        this.root=null;
    }

    checkIfSameStructure(int data){
        this.root=new Node(data);
    }

    boolean isSymmetric(Node root1,Node root2){
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null)return  false;
        return  isSymmetric(root1.left,root2.left)
                && isSymmetric(root1.right,root2.right);
    }

    public static void main(String[] args) {
        checkIfSameStructure b = new checkIfSameStructure(2);
        b.root.left = new Node(3);
        b.root.right = new Node(5);
        b.root.left.right = new Node(9);
        b.root.right.left = new Node(7);
        b.root.right.left.right = new Node(10);

        checkIfSameStructure bt = new checkIfSameStructure(6);
        bt.root.left = new Node(1);
        bt.root.right = new Node(2);
        bt.root.left.right = new Node(3);
        bt.root.right.left = new Node(4);
        bt.root.right.left.right = new Node(5);

        System.out.println(b.isSymmetric(b.root,bt.root));
    }
}