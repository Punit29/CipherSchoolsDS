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

class operations {

    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    int minElement(Node root){
        if(root==null)return -1;
        while (root.left!=null){
            root=root.left;
        }
        return root.data;
    }

    Node deleteNode(Node root,int data){
        if(root==null)return null;
        if(data<root.data){
            root.left=deleteNode(root.left,data);
        }
        else if(data>root.data){
            root.right=deleteNode(root.right,data);
        }
        else {                                    //this condition is for when we found data to be deleted
            if(root.left==null)return root.right;// it handles both cases 1child && 0 child
            if(root.right==null)return root.left;//
            else{
                root.data=minElement(root.right); //by convention we take right sub tree
                root.right=deleteNode(root.right,root.data);
            }
        }
        return root;
    }

    void  inOrder(Node root){           //LVR
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

}

public class deleteANode {
    public static void main(String[] args) {
        operations bst=new operations();
        Node root=null;
        root=bst.insert(root,15);
        root=bst.insert(root,10);
        root=bst.insert(root,20);
        root=bst.insert(root,8);
        root=bst.insert(root,12);
        root=bst.insert(root,17);
        root=bst.insert(root,25);

        root= bst.deleteNode(root,15);
        bst.inOrder(root);

    }
}