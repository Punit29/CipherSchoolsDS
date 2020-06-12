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

public class printAtLevel {
    Node root;
    printAtLevel(){
        root=null;
    }
    printAtLevel(int data){
        this.root=new Node(data);
    }

     void atLevel(Node root,int level){
        if (root==null)return;
        if(level==0){
            System.out.print(root.data+" ");
            return;
        }
        atLevel(root.left,level-1);
        atLevel(root.right,level-1);
    }

    public static void main(String[] args) {
        printAtLevel b = new printAtLevel(2);
        b.root.left= new Node(3);
        b.root.right= new Node(5);
        b.root.left.right=new Node(9);
        b.root.right.left= new Node(7);
        b.root.right.left.right= new Node(10);
        b.atLevel(b.root,2);
    }
}