package Array;

import java.util.Arrays;

public class removeElementsInPlace {

    public static void main(String[] args){
        int[] A = {1, 3, 4, 5, 6, 3};

        removeElement(A, 3);


    }


    public static int removeElement(int[] A, int elem) {
        int n = A.length;
        System.out.println("Length: " + n);
        for(int i = n-1; i >= 0; i--){
            System.out.println(A[i] + " " + i);

            if(A[i] == elem){
                System.out.println(A[i] + " - " + A[n-1]);
               // System.out.println(i + "  " + (n-1));
                System.out.println();

                A[i] = A[n-1];
                n--;
            }
        }

        System.out.println(Arrays.toString(A));
        System.out.println(n);

        return n;

    }



}
