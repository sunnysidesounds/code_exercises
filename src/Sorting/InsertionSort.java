package Sorting;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args){

        int[] sortMe = {2, 4, 5, 3, 1};


        System.out.println(Arrays.toString(sortMe));

        sort(sortMe);

        System.out.println(Arrays.toString(sortMe));

    }




    public static void sort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int temp = nums[i];

            System.out.println("temp " + temp);

            int j;
            for(j = i - 1; j >=0 && temp < nums[j]; j--){


                nums[j+1] = nums[j];
                System.out.println("a " + Arrays.toString(nums));

            }
            nums[j + 1] = temp;
            System.out.println("| " + Arrays.toString(nums));

        }

    }





}
