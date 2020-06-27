package Graphs;

import java.util.LinkedList;
import java.util.Queue;

//
//USING VISITED ARRAY
//

class graphL{
    int v;
    LinkedList<Integer> arr[];
    graphL(int v){
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

    void bfs(int n){
        boolean visited[]=new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        while (!q.isEmpty()){
            int temp=q.poll();
            System.out.print(temp+" ");
            for(Integer x:arr[temp]){
                if(visited[x]!=true){
                    q.add(x);
                    visited[x]=true;
                }
            }
        }
    }
}

public class bfsGraphArr {
    public static void main(String[] args) {
        graphL graph=new graphL(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(2,4);
        graph.bfs(0);
    }
}

