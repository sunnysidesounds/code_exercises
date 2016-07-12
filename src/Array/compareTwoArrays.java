package Array;

/*
Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
 */

import java.util.*;

public class compareTwoArrays {

    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 1, 0, 5};
        int[] array3 = {0, 0, 1, 0, 0, 1, 1, 0};
        //System.out.println("Missing from list 2: " + findValuesInPresent(array1, array2));
        printArray(array3);
    }

    public static int findValuesInPresent(int[] a1, int[] a2){
        for(int aa1 : a1){
            boolean found = false;
            for(int aa2 : a2){
                if(aa1 == aa2){
                    found = true;
                    break;
                }
            }
            if(!found){
                return aa1;
            }
        }
        return -1;
    }


    public static void printArray(int[] A){

        int energy = 100;
        for(int i = 0; i < A.length; i += 2){
            //if(i != 0) {
                int cloud = A[i];
                if(cloud == 1){
                    energy = energy -2;
                }
                energy = energy -1;



                System.out.println(i + " : " + A[i]);
           // }

        }

        System.out.println("energy : " + energy);

    }




}
