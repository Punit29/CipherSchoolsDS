
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class insertAtN {

    static Node insrtionAtN(Node head,int data,int pos,int size){
        if(pos>size+1){
            System.out.println("invalid Postion");
            return null;
        }
        if(pos==1){
            Node temp=new Node(data);
            temp.next=head;
            return temp;
        }

        Node nayaNode=new Node(data);
        Node temp = head;
        for(int i=0;i<pos-2;i++){
            temp=temp.next;
        }
        nayaNode.next=temp.next;
        temp.next=nayaNode;
        return head;
    }

    static void print(Node temp){
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    static int len(Node temp){
        int c=0;
        while(temp!=null) {
            c++;
            temp=temp.next;
        }

        return c;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);



        int size=len(head);
        head =insrtionAtN(head,9,3,size);
        print(head);
        size=len(head);
        head=insrtionAtN(head,10,1,size);
        print(head);
        size=len(head);
        head=insrtionAtN(head,20,8,size);
        print(head);
        size=len(head);
        head=insrtionAtN(head,25,10,size);
        print(head);
    }
}
