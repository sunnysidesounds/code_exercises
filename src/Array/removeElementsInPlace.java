package Array;

import java.util.Arrays;

public class removeElementsInPlace {

    public static void main(String[] args){
        int[] A = {1, 3, 4, 5, 6, 3};

        removeElement(A, 3);


    }


    public static int removeElement(int[] A, int elem) {
        int n = A.length;
        for(int i = n-1; i >= 0; i--){

            if(A[i] == elem){
                A[i] = A[n-1];
                n--;
            }
        }
        return n;

    }



}
