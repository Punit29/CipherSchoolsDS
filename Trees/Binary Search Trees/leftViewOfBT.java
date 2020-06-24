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

public class leftViewOfBT {

    Node root;

    leftViewOfBT() {
        this.root = null;
    }

    leftViewOfBT(int data) {
        this.root = new Node(data);
    }

    int levelPrint=0;
    void leftView(Node root,int level){
        if(root==null)return;
        if(level==levelPrint){
            System.out.print(root.data+" ");
            levelPrint++;
        }
        leftView(root.left,level+1);
        leftView(root.right,level+1);
    }

    public static void main(String[] args) {
        leftViewOfBT b = new leftViewOfBT(2);
        b.root.left = new Node(3);
        b.root.right = new Node(5);
        b.root.left.right = new Node(9);
        b.root.right.left = new Node(7);
        b.root.right.left.right = new Node(10);

        b.leftView(b.root,0);
    }
}
