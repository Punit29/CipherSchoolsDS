package BST;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class BSTfunc{
    Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<=root.data){
            root.left=insert(root.left,data);
        }
        else {
            root.right=insert(root.right,data);
        }
        return root;
    }

    boolean search(Node root,int data){
        if(data==root.data)return true;
        if(root==null)return false;
        if(data<=root.data){
            return search(root.left,data);
        }
        else {
            return search(root.right,data);
        }
    }
}

public class insertionInBST {
    public static void main(String[] args) {
        BSTfunc bst=new BSTfunc();
        Node root=null;
        //System.out.println(bst.search(root,8));
        root=bst.insert(root,8);
        System.out.println(bst.search(root,8));
        root=bst.insert(root,4);
        System.out.println(bst.search(root,4));
    }
}