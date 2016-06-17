package Graph;


import java.util.*;

/*
Graph implementation using a 2D adjacency matrix.
 */


public class GGraph {

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

    public void dfs(int startNode){
        boolean visited[] = new boolean[this.V];
        Stack<Integer> stack = new Stack<Integer>();
        int node;
        stack.push(startNode);
        visited[startNode] = true;
        while(!stack.isEmpty()){
            node = stack.pop();
            System.out.print(node + " ");
            for(int i = 0; i < this.V; i++){
                int adjNode = this.adjList[node][i];
                if(adjNode == 1 && !visited[i]){
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }

    }



    /**
     * Breadth first search (Queue) using 2D adjacency matrix
     * @param startNode the node you want to start at.
     */
    public void bfs(int startNode){
        boolean[] visited = new boolean[this.V];
        Queue<Integer>  queue = new LinkedList<Integer>();
        queue.add(startNode);
        visited[startNode] = true;
        int node;
        while(!queue.isEmpty()){
            node = queue.remove();
            System.out.print( node + " ");

            for(int i =0; i < this.V; i++){
                int adjNode = this.adjList[node][i];
                if(adjNode == 1 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);


                }

            }
        }
    }


    public static void main(String[] args){
        GGraph g = new GGraph(4);



        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        //System.out.println(g.getEdge(0,2));

        for(int[] a : g.adjList){
            System.out.println(Arrays.toString(a));
        }



        g.dfs(0);
    }





}
