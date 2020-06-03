package LinkedL;
import java.util.*;
//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
//Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.
//        Input:
//        The first line of input contains the number of testcase T.
//        For each testcase, the first line of input contains the number of nodes in the linked list and the number N.
//        The next line contains N nodes of the linked list.

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class nNodeFromEnd {
    Node head;
    Node tail;
    /* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            tail = node;
        } else
        {
            tail.next = node;
            tail = node;
        }
    }

    /* Drier program to test above functions */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            nNodeFromEnd llist = new nNodeFromEnd();
            //int n=Integer.parseInt(br.readLine());
            int a1=sc.nextInt();
            Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            //System.out.println(llist.head.data);
            GfG g = new GfG();
            //System.out.println(k);
            System.out.println(g.getNthFromLast(llist.head,k));

            t--;
        }
    }
}

class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
        Node p = head, f = head;
        for(int i=0; i<n-1; i++){
            f = f.next;
            if(f == null) return -1;
        }
        while(f.next != null){
            p = p.next;
            f = f.next;
        }
        return p.data;
    }
}
