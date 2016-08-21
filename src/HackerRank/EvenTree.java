package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EvenTree {


    /*




I used BFS to travel through the nodes. First, maintain an array separately to store the total number of child nodes + 1.
So, you can initially assign all the leaf nodes with value 1 in this array. Now start from the last node and count the
number of children for each node. This will work in bottom to top manner and the array that stores the number of
child nodes will help in runtime to optimize the code.

Once you get the array after getting the number of children nodes for all the nodes, just counting the nodes with
even number of nodes gives the answer. Note: I did not include root node in counting in final step.

     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int tree[];
        int count[];

        Scanner scan = new Scanner(new StringReader(
                "10 9\n" + "2 1\n" + "3 1\n" + "4 3\n" + "5 2\n" +
                        "6 1\n" + "7 2\n" + "8 6\n"+ "9 8\n"+ "10 8\n"));

        int N = scan.nextInt(); //points
        int M = scan.nextInt();

        tree = new int[N];
        count = new int[N];
        Arrays.fill(count, 1);

        int[][] treeD = new int[N][N];

        for(int i=0;i<M;i++){
            int u1 = scan.nextInt();
            int v1 = scan.nextInt();
            treeD[u1-1][v1-1] = 1;
        }



        System.out.println(Arrays.deepToString(treeD));

        System.out.println(findMaximumNUmberOfEdges(treeD));

 for(int i=0;i<M;i++) {
     int u1 = scan.nextInt();
     int v1 = scan.nextInt();

     tree[u1-1] = v1;

     count[v1-1] += count[u1-1];

     int root = tree[v1-1];

     while(root!=0)
     {
         count[root-1] += count[u1-1];
         root = tree[root-1];
     }
 }

 int counter = -1;
 for(int i=0;i<count.length;i++)
 {
     if(count[i]%2==0)
     {
         counter++;
     }

 }

 System.out.println(Arrays.toString(count));
 System.out.println(Arrays.toString(tree));
 System.out.println(counter);

    }


    /*
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
     */

    public static int findMaximumNumberOfEdges(int[][] tree){
        int maxCount = 0;
        for(int i = 1; i <= tree.length; i++){
            System.out.println(i);
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(i);

            while(!q.isEmpty()){
                int value = q.remove();
                System.out.println("value; " + value);
                for(int j = 0; j < tree.length; j++){
                    int child = tree[value][j];
                    System.out.println("child; " + child);
                    if(child == 1){
                        //q.add()
                        break;
                    }


                }




            }




        }
        return maxCount;
    }


    public static int findMaximumNUmberOfEdges(int[][] tree){
        int maxCount = 0;
        int[] count = new int[tree.length];


        int j = 0;
        for(int i = 0; i < tree.length; i++){
            int value = tree[i][j];
            //System.out.println("i : " + (i+1) + " j : " + (j+1) + " : " + value);
            if(value == 1){
                System.out.println("  -- i : " + (i+1) + " j : " + (j+1) + " : value : " + value);
                countChildren(i, tree);



            }
            if(i == tree.length-1 && j != tree.length-1){
                j++;
                i = 0;
            }
        }

        System.out.println("Count : " + Arrays.toString(count));

        return maxCount;
    }


    public static int countChildren(int start, int[][]tree){
        int count = 0;
        boolean[] visited = new boolean[tree.length];
        Queue<Integer>  queue = new LinkedList<Integer>();
        queue.add(start);
        visited[start] = true;
        int node;
        while(!queue.isEmpty()){
            node = queue.remove();
            System.out.println( node + " ** ");

            for(int i =0; i < tree.length; i++){
                int adjNode = tree[node][i];
                if(adjNode == 1 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);


                }

            }
        }



        return count;
    }


}
