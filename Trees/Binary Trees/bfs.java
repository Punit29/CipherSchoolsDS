package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

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

public class bfs {
    Node root;

    bfs() {
        this.root = null;
    }

    bfs(int data) {
        this.root = new Node(data);
    }
    void printBfs(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        bfs b = new bfs(2);
        b.root.left = new Node(3);
        b.root.right = new Node(5);
        b.root.left.right = new Node(9);
        b.root.right.left = new Node(7);
        b.root.right.left.right = new Node(10);

        b.printBfs(b.root);

    }
}