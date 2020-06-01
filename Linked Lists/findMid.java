
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class findMid {

    static void mid(Node temp,int n){
        for(int i=0;i<n/2;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    static void midEfficient(Node head){
        Node fptr=head;
        Node sptr=head;
        while(fptr!=null && fptr.next!=null){
            fptr=fptr.next.next;
            sptr=sptr.next;
        }
        System.out.println(sptr.data);
    }

    static int len(Node temp) {
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }


    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        mid(head,len(head));
        midEfficient(head);
        head.next.next.next.next.next=new Node(10);
        mid(head,len(head));
        midEfficient(head);
    }
}