package Graph;

import java.util.*;

public class GraphHack {

    private int numberOfVertices;
    private LinkedList[] adjacencyLists;

    public GraphHack(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        this.adjacencyLists = new LinkedList[numberOfVertices];

        for (int i = 0; i < numberOfVertices; i++) {
            this.adjacencyLists[i] = new LinkedList<Integer>();
        }

    }

    public LinkedList[] getAdjacencyLists() {
        return this.adjacencyLists;
    }


    public void addEdge(int v, int w) {
        this.adjacencyLists[v].add(w);
    }

    public void dfs(int startNode){
        boolean visitedNode[] = new boolean[this.numberOfVertices];
        Stack<Integer> stack = new Stack<Integer>();

        visitedNode[startNode] = true;
        stack.push(startNode);

        while(!stack.isEmpty()){
            startNode = stack.pop();
            System.out.print(startNode + " ");
            ListIterator<Integer> i = this.adjacencyLists[startNode].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if (!visitedNode[n]){
                    visitedNode[n] = true;
                    stack.push(n);
                }
            }
        }
    }

    public void bfs(int startNode){
        boolean visitedNode[] = new boolean[this.numberOfVertices];
        Queue<Integer> queue = new LinkedList<Integer>();

        visitedNode[startNode] = true;
        queue.add(startNode);

        while(!queue.isEmpty()){
            startNode = queue.remove();
            System.out.print(startNode + " ");
            ListIterator<Integer> i = this.adjacencyLists[startNode].listIterator();
            while(i.hasNext()){
                int n = i.next();
                System.out.println(n);
                if(!visitedNode[n]){
                    visitedNode[n] = true;
                    queue.add(n);
                }
            }
        }

    }


    public void dfs_recursive(int startNode){
        boolean visisted[] = new boolean[this.numberOfVertices];
        dfs_recursive_util(startNode, visisted);
    }

    private void dfs_recursive_util(int startNode, boolean visited[]){
        visited[startNode] = true;
        System.out.println(startNode + " ");
        ListIterator<Integer> i = this.adjacencyLists[startNode].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if (!visited[n]){
                dfs_recursive_util(n, visited);
            }


        }






    }



    public static void main(String[] args){
        GraphHack g = new GraphHack(4);
        //g.addEdge(0, 1);
        //g.addEdge(0, 4);
        //g.addEdge(1, 2);
        //g.addEdge(4, 3);
        //g.addEdge(2, 3);
        //g.addEdge(3, 5);
        //g.addEdge(5, 5);
        //
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);


        int[][] test = new int[4][4];




        System.out.println(Arrays.toString(g.getAdjacencyLists()));
        int node = 0;
        for(LinkedList j : g.getAdjacencyLists()){

            System.out.println("node : " + node + "  --> edges : " + j);
            node++;
        }


        System.out.println("Breadth First Search");
        g.bfs(0);
        System.out.println("");
        System.out.println("Depth First Search Recursive");
        g.dfs_recursive(0);
        System.out.println("");
        System.out.println("Depth First Search");
        g.dfs(0);

    }






}
