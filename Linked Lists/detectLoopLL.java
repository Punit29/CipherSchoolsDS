package LinkedL;
import java.util.*;
//https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
/*Given a linked list of N nodes. The task is to check if the the linked list has a loop. Linked list can contain self loop.
Input:
First line of input contains number of testcases T.
For each testcase, first line of input contains length of linked list and next line contains the data of linked list.*/

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class detectLoopLL {
    static Node head;
    public static void push(int new_data) {
        /* 1 & 2: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    public static void main(String args[]) {
        int t, d, n, i, x, c;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (d = 0; d < t; d++) {
            n = sc.nextInt();
            head = null;
            Node q;
            for (i = 0; i < n; i++) {
                x = sc.nextInt();
                push(x);
            }
            Node p;
            p = head;
            q = head;
            while (q.next != null) q = q.next;
            c = sc.nextInt();
            if (c > 0) {
                c = c - 1;
                for (i = 0; i < c; i++) {
                    p = p.next;
                }
                q.next = p;
            }
            Solution sln = new Solution();
            if (sln.detectLoop(head) == 1)
                System.out.print("True\n");
            else
                System.out.print("False\n");
        }
    }
}
class Solution {
    public int detectLoop(Node head) {
        // Add code here
        Node sptr=head;
        Node fptr=head;
        while(fptr!=null && fptr.next!=null){
            sptr=sptr.next;
            fptr=fptr.next.next;
            if(sptr == fptr){
                return 1;
            }
        }
        return 0;
    }
}