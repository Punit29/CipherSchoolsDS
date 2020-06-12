/*package BinaryTree;

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

public class dfs {
    Node root;
    dfs(){
        this.root=null;
    }

    dfs(int data){
        this.root=new Node(data);
    }

    void preOrder(Node root){           //VLR
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void  inOrder(Node root){           //LVR
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    void  postOrder(Node root){         //LRV
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        dfs b = new dfs(2);
        b.root.left= new Node(3);
        b.root.right= new Node(5);
        b.root.left.right=new Node(9);
        b.root.right.left= new Node(7);
       // b.root.right.left.right= new Node(10);
        b.preOrder(b.root);
        System.out.println();
        b.inOrder(b.root);
        System.out.println();
        b.postOrder(b.root);
    }
}
*/