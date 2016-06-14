package Graph;


import java.util.*;

public class GGraph {


    public static void main(String[] args){
        GGraph g = new GGraph(6);



        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 0);

        System.out.println(g.getEdge(0,2));


        System.out.println(Arrays.toString(g.adjList));
        g.bfs(0);
    }

    int V;
    int[][] adjList;


    public GGraph(int V){
        this.V = V;
        this.adjList = new int[V][V];
    }

    public int getEdge(int to, int from){
        return this.adjList[to][from];
    }

    public void addEdge(int to, int from){
        this.adjList[to][from] = 1;

    }


    public void bfs(int startNode){
        boolean[] visited = new boolean[this.V];
        Queue<Integer>  queue = new LinkedList<Integer>();
        queue.add(startNode);
        visited[startNode] = true;
        while(!queue.isEmpty()){
            startNode = queue.remove();
            System.out.println("Val " + startNode);

            for(int i =0; i < this.V; i++){
               // int n = this.adjList[val][i];
                //System.out.println(n);
              //  if(!visited[n]){
              //    visited[n] = true;
              //    queue.add(n);
              //  }

            }







        }








    }








}
