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

    Node findLCA(Node root,int n1,int n2){
        if(root==null)return null;
        if(n1<root.data && n2<root.data)
            return findLCA(root.left,n1,n2);
        if(n1>root.data && n2>root.data)
            return findLCA(root.right,n1,n2);
        return root;
    }

}

public class LCAinBST {
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

        System.out.println(bst.findLCA(root,8,25).data);
        System.out.println(bst.findLCA(root,17,20).data);
        System.out.println(bst.findLCA(root,8,10).data);

    }
}