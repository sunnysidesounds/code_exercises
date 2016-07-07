package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistance {


    public static void main(String[] args) {
        Scanner in = new Scanner(new StringReader(
                "6\n" + "7 1 3 4 1 7\n"
        ));
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int output = findMinimumDistance(A);
        System.out.println(output);

    }

    public static int findMinimumDistance(int[] A){
        int currentMinimum = -1;
        if(A.length != 0){
            for(int i = 0; i < A.length; i++){
                int startIndex = A[i];
                for(int j = A.length-1; j > i; j--){
                    int endIndex = A[j];
                    if(startIndex == endIndex){
                        int distance = Math.abs(i - j);
                        if(currentMinimum == -1){
                            currentMinimum = distance;
                            break;
                        } else if (distance < currentMinimum){
                            currentMinimum = distance;
                            break;
                        }
                    }
                }
            }
        }
        return currentMinimum;
    }

}
