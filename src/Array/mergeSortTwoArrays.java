package Array;


import java.util.Arrays;
import java.util.List;

/**

 Given two sorted integer arrays A and B, merge B into A as one sorted array.

 Note:
 You may assume that A has enough space (size that is greater or equal to m + n)
 to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.

 1)

 - A and B are sorted
 - merge B into A
 - A size is >= (m + n) so can hold B's elements

 - A has m elements initialized
 - B has n elements initialized


 2)

 int A = {1, 3, 5, 9, 13, 15}
 int B = {2, 4, 6, 8, 10, 12}

 expected output = {1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 13, 15}




 */


public class mergeSortTwoArrays {

    public static void main(String[] args){
        int[] a1 =  {1, 3, 5, 9, 13, 15};
        int[] b1 =  {2, 4, 6, 8, 10, 12};

        int[] merged = mergeTwoArray(a1, b1);

        System.out.println("Merged two arrays from scratch no order: " + Arrays.toString(merged));





    }

    public static int[] mergeTwoArray(int[] a1, int[] a2){
        int lenA = a1.length;
        int lenB = a2.length;
        int[] newArray = new int[lenA + lenB];
        for(int i = 0; i < lenA; i++){
            newArray[i] = a1[i];
        }
        for(int k = 0,j = lenA; k < lenB && j < newArray.length; j++, k++ ){
            newArray[j] = a2[k];
        }
        return newArray;

    }

   /*
    public static void merge(int A[], int m, int B[], int n){
        while(m > 0 && n > 0){



        }


    }  */







}
