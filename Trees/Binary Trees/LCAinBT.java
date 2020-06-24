package BinaryTree;

//WILL ALSO WORK IN BST

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

public class LCAinBT {
    Node root;

    LCAinBT() {
        this.root = null;
    }

    LCAinBT(int data) {
        this.root = new Node(data);
    }

    Node findLCA(Node root,int n1,int n2){
        if(root==null)return null;
        if(root.data==n1 || root.data==n2)return  root;
        Node left_LCA = findLCA(root.left,n1,n2);
        Node right_LCA = findLCA(root.right,n1,n2);
        if(left_LCA!=null && right_LCA!=null){
            return root;
        }
        if(left_LCA!=null)return left_LCA;
        return right_LCA;
    }

    public static void main(String[] args) {
        LCAinBT b = new LCAinBT(2);
        b.root.left = new Node(3);
        b.root.right = new Node(5);
        b.root.left.right = new Node(9);
        b.root.right.left = new Node(7);
        b.root.right.left.right = new Node(10);

       Node lca= b.findLCA(b.root,10,7);
       System.out.println(lca.data);
    }
}