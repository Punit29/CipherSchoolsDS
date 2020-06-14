
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


public class checkIfMirror {
    Node root;
    checkIfMirror(){
        this.root=null;
    }

    checkIfMirror(int data){
        this.root=new Node(data);
    }

    boolean isMirror(Node root1,Node root2){
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null)return  false;
        return root1.data==root2.data && isMirror(root1.left,root2.right)
                && isMirror(root1.right,root2.left);
    }

    public static void main(String[] args) {
        checkIfMirror b = new checkIfMirror(2);
        b.root.left= new Node(3);
        b.root.right= new Node(5);
        b.root.left.right=new Node(9);
        b.root.right.left= new Node(7);
        b.root.right.left.right= new Node(10);

        checkIfMirror bt = new checkIfMirror(2);
        bt.root.right= new Node(3);
        bt.root.left= new Node(5);
        bt.root.right.left=new Node(9);
        bt.root.left.right= new Node(7);
        bt.root.left.right.left=new Node(10);

        System.out.println(b.isMirror(b.root,bt.root));

    }
}
