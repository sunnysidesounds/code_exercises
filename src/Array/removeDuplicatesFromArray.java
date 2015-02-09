package Array;

import java.util.*;

public class removeDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3 };
        int[] out = findDuplicatesInArray(arr);

        System.out.println(Arrays.toString(out));
       // System.out.println(arr.length);
    }


    public static int[] findDuplicatesInArray(int[] arr){

        HashSet<Integer> output = new HashSet<Integer>();
        for(int i=0; i <= arr.length-1; i++){
            output.add(arr[i]);
        }
        int[] out = new int[output.size()];
        int count = 0;
        for(Integer v : output){
            out[count] = v;
            count++;
        }

        return out;

    }


    public static int[] removeDuplicates(int[] A) {
        if (A.length < 2)
            return A;

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;

            }
        }

        int[] B = Arrays.copyOf(A, j + 1);

        return B;
    }






}
