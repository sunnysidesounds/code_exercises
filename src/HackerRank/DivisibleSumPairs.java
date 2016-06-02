package HackerRank;

import java.util.*;

public class DivisibleSumPairs {


    public static void main(String[] args){

        int[] N = {1, 3, 2, 6, 1, 2};
        int k = 3;

        //System.out.println(diviableSumPairs1(N, k));
        System.out.println(diviableSumPairs2(N, k));






    }

    public static int diviableSumPairs2(int[] arr, int k){
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;

        // output array to record matching pairs
        StringBuilder arrs = new StringBuilder();

        while (start < end) {
            sum = arr[start] + arr[end];

            System.out.println(sum + " start : " + arr[start] + " end : " + arr[end] );

            if (sum == k) {
                // we have found one pair, add it to our output array
                arrs.append(arr[start] + "," + arr[end] + ";");
                start++;
                end--;
            } else if (sum < k) {
                // if the sum of the pair is less than the sum we are searching
                // then increment the start pointer which would give us the sum
                // more than our current sum as the array is sorted
                start++;
            } else {
                // if the sum of the pair is greater than the sum we are searching
                // then decrement the end pointer which would give us the sum
                // less than our current sum as the array is sorted
                end--;
            }
        }
        System.out.println(arrs.toString());
        return 0;

    }


    public static int diviableSumPairs1(int[] N, int k){
        int count = 0;
        for(int i = 0; i < N.length; i++){
            int first = N[i];
            for(int j = (i+1); j < N.length; j++){
                int second = N[j];
                if((first + second) % k == 0){

                    count++;
                }
                System.out.println(first + " : " + second + " (" + i + " " + j + ")");


            }


        }
        return count;
    }




}
