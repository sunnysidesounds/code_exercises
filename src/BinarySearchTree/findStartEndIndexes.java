package BinarySearchTree;

/*
Given a sorted integer array and a number, find the start and end indexes of n in the array. e.g. {0,0,1,1,1,5,5,6,6,6,6,7,11}, n = 5 -> output {5,6}


Set number to search for
Get length of array, check if number is at the half point
if the half is > the #, check the half of the bottom half. is <, do the inverse
repeat
    if the half point is the #, mark the first time this happens as a variable storing its index
    then repeat binary searches above , and then binary searches below (separately), such that you check for how far to the left/right it can repeat.
    note*: and you sort binary left/right instead of just incrementally, in case your code is tested in a dataset with like 1,000,000 3's in a row or something

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
        int high = arr.length-1;
        int start = -1;
        int end = -1;
        int[] output = {start, -1};

        if(arr.length == 0){
           return output;
        }


        while(low <= high){
            int mid = low + (high - low) / 2;
            if(value < arr[mid]){
                high = mid - 1;
            } else if (value == arr[mid]){
                start = mid;
                high = mid - 1;
            } else {
                low = mid - 1;
            }
        }

        System.out.println(start);



        return output;
    }


}
