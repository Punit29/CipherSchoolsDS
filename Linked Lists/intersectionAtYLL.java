package LinkedL;
import java.util.*;
//https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1/
//Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.
//Input:
//        First line of input is the number of test cases T.
//        Every test case has four lines. First line of every test case contains three numbers, x (number of nodes before merge point in 1st list),
//        y (number of nodes before merge point in 2nd list) and z (number of nodes after merge point).
//        Next three lines contain x, y and z values.

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}


public class intersectionAtYLL {
    Node head = null;
    Node tail = null;

    public void addToTheLast(Node node)
    {

        if (head == null) {
            head = node;
            tail = head;
        } else {
            //Node temp = head;
            //while (temp.next != null)
            //temp = temp.next;

            //temp.next = node;
            tail.next=node;
            tail = node;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            intersectionAtYLL llist1 = new intersectionAtYLL();
            intersectionAtYLL llist2 = new intersectionAtYLL();
            intersectionAtYLL llist3 = new intersectionAtYLL();

            int a1=sc.nextInt();
            Node head1= new Node(a1);
            Node tail1= head1;

            for (int i = 1; i < n1; i++)
            {
                int a = sc.nextInt();
                tail1.next = (new Node(a));
                tail1= tail1.next;
            }


            int b1=sc.nextInt();
            Node head2 = new Node(b1);
            Node tail2 = head2;
            for (int i = 1; i < n2; i++)
            {
                int b = sc.nextInt();
                tail2.next = (new Node(b));
                tail2= tail2.next;
            }

            int c1=sc.nextInt();
            Node head3= new Node(c1);
            tail1.next = head3;
            tail2.next = head3;
            Node tail3=head3;
            for (int i = 1; i < n3; i++)
            {
                int c = sc.nextInt();
                tail3.next = (new Node(c));
                tail3= tail3.next;
            }

            Intersect obj = new Intersect();
            System.out.println(obj.intersectPoint(head1, head2));
            t--;
        }
    }
}

class Intersect
{
    int intersectPoint(Node headA, Node headB)
    {
        // code here
        int lenA=0;
        int lenB=0;
        Node temp=headA;
        while(temp!=null){
            temp=temp.next;
            lenA++;
        }

        temp=headB;
        while(temp!=null){
            temp=temp.next;
            lenB++;
        }

        int d=Math.abs(lenA-lenB);

        Node tempA;
        Node tempB;

        if(lenA>=lenB){
            tempA=headA;
            tempB=headB;
        }
        else{
            tempA=headB;
            tempB=headA;
        }

        for(int i=0;i<d;i++){
            tempA=tempA.next;
        }

        while(tempA!=null && tempB!=null){
            if(tempA==tempB){
                return tempA.data;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return -1;
    }
}

