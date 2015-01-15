package Array;

import java.util.Arrays;

public class reverseArrayInPlace {


    public static void main(String args[]){

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Before: " + Arrays.toString(array));


        for(int i = 0, k = array.length-1; i < array.length / 2; i++, k--){
            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
        System.out.println("After: " + Arrays.toString(array));
    }



}
