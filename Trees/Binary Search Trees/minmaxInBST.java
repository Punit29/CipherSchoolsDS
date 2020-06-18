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

class operations{

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

    void  inOrder(Node root){           //LVR
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    int minElement(Node root){
        if(root==null)return -1;
        while (root.left!=null){
            root=root.left;
        }
        return root.data;
    }

    int maxElement(Node root){
        if(root==null)return -1;
        while (root.right!=null){
            root=root.right;
        }
        return root.data;
    }

}

public class minmaxInBST {
    public static void main(String[] args) {
        operations bst=new operations();
        Node root=null;
        root=bst.insert(root,15);
        root=bst.insert(root,10);
        root=bst.insert(root,26);
        root=bst.insert(root,8);
        root=bst.insert(root,12);
        root=bst.insert(root,17);
        root=bst.insert(root,29);

        bst.inOrder(root);
        System.out.println();
        System.out.println(bst.minElement(root));
        System.out.println(bst.maxElement(root));

    }
}