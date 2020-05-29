

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class insLL {

    static Node insertAtHead(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }

    static void insertAtEnd(Node head,int data){
        Node temp=new Node(data);
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=temp;
    }

    static void print(Node temp){
        //int count=0;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
          //  count++;
        }
        System.out.println();
        //System.out.println("No. of Nodes "+count);
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        head=insertAtHead(head,6);
        Node temp=head;
        insertAtEnd(head,7);
        print(temp);
    }
}
