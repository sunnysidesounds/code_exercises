package LeekCode;

import java.util.Arrays;

public class ContainsDuplicates {

    /*

    Given an array of integers, find if the array contains any duplicates.
     Your function should return true if any value appears at least twice in the array,
     and it should return false if every element is distinct.

     */

    public static void main(String[] args){

        int[] nums = {9, 2, 3, 33, 5, 6, 7};
        System.out.println(containsDuplicate(nums));


    }


    public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        int [] numbers = nums;
        Arrays.sort(numbers);
        for(int i = 0; i < len-1; i++){
            int firstNumber = numbers[i];
            int secondNumber = numbers[i+1];
            if(firstNumber == secondNumber){
                return true;
            }
        }
        return false;
    }


}
