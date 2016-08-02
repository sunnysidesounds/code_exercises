package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class JumpingOnTheClouds {


    public static void main(String[] args){
        Scanner in = new Scanner(new StringReader(
                "7\n"
                + "0 0 1 0 0 1 0\n"));

        /*Scanner in = new Scanner(new StringReader(
                "6\n"
                        + "0 0 0 1 0 0\n"));*/

        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        System.out.println(Arrays.toString(c));
        System.out.println(minimumJumpsToWin(c, 0));

    }


    public static int minimumJumpsToWin(int[] arr, int i){
        int jumps = 0;
        if(Math.abs(i - (arr.length-1)) >= 2 && arr[i] == arr[i+2]){
            jumps = minimumJumpsToWin(arr, i+2) + 1;
        } else if (i != arr.length-1 && arr[i] == arr[i+1]){
            jumps = minimumJumpsToWin(arr, i+1) + 1;
        }
        return jumps;
    }


    public static int minimumJumpsToWin(int[] arr){
        int jumps = 0;
        for(int i = 0; i < arr.length-2; i++){

            if(arr[i] == arr[i+2]){
                jumps++;
                i = i + 1;
            } else if (arr[i] == arr[i+1]){
                jumps++;
            }


        }
        return jumps;
    }

}
