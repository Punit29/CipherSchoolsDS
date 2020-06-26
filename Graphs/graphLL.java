package Graphs;

import java.util.LinkedList;

class graph{
    int v;
    LinkedList<Integer> arr[];
    graph(int v){
        this.v=v;
        arr = new LinkedList[v];//arr can now store v LL
        for (int i=0;i<v;i++){
            arr[i]=new LinkedList<>();//array main new empty LL hai
        }
    }

    void addEdge(int a,int b){
        arr[a].add(b);//0 ka link 1 se
        //arr[b].add(a);//bidirectional ke case main
    }

    void print(){
        for (int i=0;i<v;i++){
            System.out.println("Neighbours of "+i +" are: ");
            for (Integer x:arr[i]) {
                System.out.print(x +" ");
            }
            System.out.println();
        }
    }

}

public class graphLL {
    public static void main(String[] args) {
        graph graph=new graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,1);//issue it repeats the connection solution is use SETs
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(2,4);
        graph.print();
    }
}
