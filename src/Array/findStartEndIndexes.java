package Array;

/*
Given a sorted integer array and a number, find the start and end indexes of n in the array. e.g. {0,0,1,1,1,5,5,6,6,6,6,7,11}, n = 5 -> output {5,6}


 */


import java.util.Arrays;

public class findStartEndIndexes {

    public static void main(String[] args){

        int[] sortedArray = {0,0,1,1,1,5,5,6,6,6,6,7,11};
        int n = 5;

        System.out.println(Arrays.toString(findStartEnd(sortedArray, n)));
    }


    public static int[] findStartEnd(int[] arr, int value){
        int low = 0;
        int high = arr.length;
        int start = -1;
        int end = -1;
        int[] output = {start, end};
        // start index
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(value < arr[mid]){
                high = mid -1;
            } else if (value == arr[mid]){
                start = mid;
                high = mid -1;
            } else {
               low = mid + 1;
            }
        }
        output[0] = start;

        low = 0;
        high = arr.length;
        // end index
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(value < arr[mid]){
                high = mid -1;
            } else if (value == arr[mid]){
                end = mid;
                low = mid + 1;
            } else {
                low = mid + 1;
            }
        }

        output[1] = end;
         return output;

    }


}
