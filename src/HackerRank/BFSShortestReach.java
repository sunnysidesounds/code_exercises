package HackerRank;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class BFSShortestReach {



    public static void main(String[] args){

        Scanner in = new Scanner(new StringReader(
                "2\n" + "4 2\n" + "1 2\n" + "1 3\n" + "1\n" +
                        "3 1\n" + "2 3\n" + "2\n"));

        int t = in.nextInt();
        System.out.println("t : ");

        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] list = new int[n][n];

            System.out.println("n : " + (n) + " m : " + m);
            for(int j = 0; j < m; j++){
                int x = in.nextInt();
                int y = in.nextInt();
                list[x][y] = 1;
                System.out.println("x : " + x + " y : " + y);

            }
            int s = in.nextInt();
            System.out.println("s : " + s);

            System.out.println("list : " + Arrays.deepToString(list));

            for(int p = 0; p < n; p++){
                int search = list[s][p];
                System.out.println("search : " + search);

            }





        }






    }



}
