package Array;


import java.util.Arrays;

/*
In an array 1-100 numbers are stored, one number is missing how do you find it?
 */

public class findMissingNumberInArray {

    public static void main(String[] args){

        //Add test data for problem
        int removeInt = 36;
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++){
            if(removeInt != (i+1)){
                arr[i] = i+1;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Missing number is: " + findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] array){
        int len = array.length;
        for(int i = 0; i < len-1; i++){
            if((array[i+1]) - array[i] != 1){
                return array[i] + 1;
            }
        }

        return -1;
    }






}
