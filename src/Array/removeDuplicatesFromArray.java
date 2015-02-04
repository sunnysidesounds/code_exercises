package Array;

import java.util.*;

public class removeDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3 };
        arr = removeDuplicates(arr);
        System.out.println(arr.length);
    }



    public static int[] removeDuplicates(int[] A) {
        if (A.length < 2)
            return A;

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] == A[j]) {
                System.out.println("Match ==  i: " + A[i] + "  j: " + A[j] );


                i++;

                System.out.println("i: iterator = " + i);
            } else {

                System.out.println("i: " + A[i] + "  j: " + A[j] );

                j++;
                A[j] = A[i];
                i++;


                System.out.println("array" + Arrays.toString(A) );
                System.out.println("i: iterator = " + i);
                System.out.println("j: iterator = " + j);

            }
        }

        int[] B = Arrays.copyOf(A, j + 1);

        return B;
    }



}
