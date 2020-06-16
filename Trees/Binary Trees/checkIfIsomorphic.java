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


public class checkIfIsomorphic {
    Node root;
    checkIfIsomorphic(){
        this.root=null;
    }

    checkIfIsomorphic(int data){
        this.root=new Node(data);
    }

    boolean isIsomorphic(Node root1, Node root2){
        if(root1 == null && root2==null)return true;
        if(root1 == null || root2==null)return false;
        return root1.data==root2.data
                &&((isIsomorphic(root1.left,root2.left)
                    && isIsomorphic(root1.right,root2.right))
                || (isIsomorphic(root1.left,root2.right)&&
                    isIsomorphic(root1.right,root2.left)));
    }

    public static void main(String[] args) {
        checkIfIsomorphic b = new checkIfIsomorphic(2);
        b.root.left = new Node(3);
        b.root.right = new Node(5);
        b.root.left.right = new Node(9);
        b.root.right.left = new Node(7);
        b.root.right.left.right = new Node(10);

        checkIfIsomorphic bt = new checkIfIsomorphic(2);
        bt.root.left = new Node(3);
        bt.root.right = new Node(5);
        bt.root.left.left = new Node(9);
        bt.root.right.right = new Node(7);
        bt.root.right.left.right = new Node(10);

    }
}