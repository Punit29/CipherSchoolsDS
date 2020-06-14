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


public class checkIfIdentical {
    Node root;
    checkIfIdentical(){
        this.root=null;
    }

    checkIfIdentical(int data){
        this.root=new Node(data);
    }

    boolean isIdentical(Node root1,Node root2){
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null)return  false;
        return root1.data==root2.data && isIdentical(root1.left,root2.left)
                && isIdentical(root1.right,root2.right);
    }

    public static void main(String[] args) {
        checkIfIdentical b = new checkIfIdentical(2);
        b.root.left= new Node(3);
        b.root.right= new Node(5);
        b.root.left.right=new Node(9);
        b.root.right.left= new Node(7);
        //b.root.right.left.right= new Node(10);

        checkIfIdentical bt = new checkIfIdentical(2);
        bt.root.left= new Node(3);
        bt.root.right= new Node(5);
        bt.root.left.right=new Node(9);
        bt.root.right.left= new Node(7);

        System.out.println(b.isIdentical(b.root,bt.root));

    }
}