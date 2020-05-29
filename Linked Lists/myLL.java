package LinkedL;

    class Node1{
        int data;
        Node1 next;
        Node1(int data){
            this.data=data;
            this.next=null;
        }
    }

public class myLL {
        static void print(Node1 temp){
            int count=0;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
                count++;
            }
            System.out.println();
            System.out.println("No. of Nodes "+count);
        }
    public static void main(String[] args) {
        Node1 head=new Node1(1);
        head.next=new Node1(2);
        head.next.next=new Node1(3);
        head.next.next.next=new Node1(4);
        head.next.next.next.next=new Node1(5);
//NOT A GOOD WAY
//        while(head !=null){
//            System.out.println(head.data);
//            head=head.next;
//        }
        Node1 temp=head;
        print(temp);


    }
}
