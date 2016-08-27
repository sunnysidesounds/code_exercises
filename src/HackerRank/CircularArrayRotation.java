package HackerRank;

import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CircularArrayRotation {


    public static void main(String args[]){

    /*
        Scanner scan = new Scanner(new StringReader(
                "3 2 3\n" // N K Q1
                + "1 2 3\n"    // 2
                + "0\n"
                        + "1\n"
                        + "2\n"


        ));

        */



        Scanner scan = new Scanner(new StringReader(
                "6 4 3\n" // N K Q1
                        + "1 2 3 4 5 6\n"    // 2
                        + "0\n"
                        + "1\n"
                        + "2\n"


        ));


        int N = scan.nextInt();
        int K = scan.nextInt();
        int Q = scan.nextInt();

        int[] aArray = new int[N];
        int[] mArray = new int[Q];

        for(int a = 0; a < N; a++){
            aArray[a] = scan.nextInt();
        }

        for(int m = 0; m < Q; m++){
            mArray[m] = scan.nextInt();
        }
        int[] result = circularArrayRotation(aArray, K);
        for(int i = 0; i < mArray.length; i++){
            int index = mArray[i];
            System.out.println(result[index]);
        }



    }


    public static int[] circularArrayRotation(int[] arr, int k){
        int len = arr.length;
        int[] result = new int[len];
        if (k > len){
            k = k % len;
        }
        for(int i = 0; i < k; i++){
            result[i] = arr[len - k + i];
        }
        int j = 0;
        for(int i = k; i < len; i++ ){
            result[i] = arr[j];
            j++;
        }
        return result;
    }


    public static void circularArrayRotation(int[] arr, int k, int d){
        if(k == 0){
            //System.out.println(Arrays.toString(arr));
        } else {
            int last = arr[arr.length-1];
            for(int i = arr.length-1; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
            circularArrayRotation(arr, k-1);
        }
    }




}
