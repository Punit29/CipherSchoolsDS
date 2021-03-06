package Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class GraphSm{
    HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();

    void addVertex(int data){
        if(graph.containsKey(data)){
            System.out.println("already entered");//now it will not be updated
            return;
        }
        graph.put(data,new HashSet<>());
    }

    void  addEdge(int a, int b){
        //add b to the set of a
        //graph.get(a);//this is a set
        graph.get(a).add(b);
        //graph.get(b).add(a);//For bi-directional
    }

    void print(){
        System.out.println("Vertices are: "+graph.keySet());
        for(Integer x: graph.keySet()){
            System.out.print("Neighbours of "+ x +" are -");
            System.out.println(graph.get(x));
        }
    }

}

public class GraphImp {
    public static void main(String[] args) {
        GraphSm g = new GraphSm();
        g.addVertex(0);
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.addEdge(2,4);
        g.addVertex(0);//it returns[] therefore adding if in addVertex
        g.print();
    }
}
