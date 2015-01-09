package BinarySearch;

import java.util.*;


public class simpleBinarySearch {


    public static void main(String[] args){
        int[] array = sortedTestArray(200);

        int searchValue = 86;
        int low = 0;
        int high = array.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(searchValue < array[mid]){
                high = mid -1;
            } else if (searchValue == array[mid]){
                System.out.println("Found value: " + array[mid] + " at index: " + mid);
                break;
            } else {
                low = mid + 1;
            }

        }
        System.out.println(Arrays.toString(sortedTestArray(200)));

    }

    public static int[] sortedTestArray(int size){
        int[] array = new int[size];
        for(int i = 0; i <size; i++){
            array[i] = i+1;
        }
        return array;

    }




}
