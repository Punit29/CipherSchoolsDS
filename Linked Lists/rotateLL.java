package LinkedL;
import java.util.*;

//https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1
//Given a singly linked list of size N. The task is to rotate the linked list counter-clockwise by k nodes,
//        where k is a given positive integer smaller than or equal to length of the linked list.
//
//        Input:
//        The first line of input contains the number of testcases T.
//        For each test case, the first line of input contains the length of a linked list and the next line contains linked list elements and the last line contains k,
//        by which linked list is to be rotated.

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class rotateLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            Node tail = null;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(i==0)
                {
                    head = new Node(a);
                    tail = head;
                }
                else{
                    tail.next = new Node(a);
                    tail = tail.next;
                }
            }
            int k = sc.nextInt();
            Rotate g = new Rotate();
            head = g.rotate(head,k); // rotate linked list anti-clockwise by k nodes
            printList(head);
        }
    }
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
class Rotate {

    /*  This function should rotate list counter-
   clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        // add code here.
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        Node ptr=null;
        while(k-->0){
            ptr=head;
            head=head.next;
        }
        ptr.next=null;
        return head;
    }
}
