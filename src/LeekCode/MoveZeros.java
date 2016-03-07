package LeekCode;

import java.util.Arrays;

public class MoveZeros {


/*
Given an array nums, write a function to move all 0's to the end
of it while maintaining the relative order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */


    public static void main(String[] args){
        int[] nums = {0, 0, 4, 0, 4, 5, 0, 0};
        System.out.println(Arrays.toString(nums));

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));


    }

    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int c = 0;
        for(int i = 0; i < len-1; i++){
            if(nums[i] != 0){
                nums[c++] = nums[i];
            }

        }
        while(c < len){
            nums[c++] = 0;
        }

    }


   /*
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        boolean hasZero = false;
        for(int i = 0; i < len; i++){
            if(hasZero && i != 0){
                i = 0;
                hasZero = false;
            }
            if(nums[i] == 0){
                int temp = nums[i];
                for(int k = i; k < len-1; k++){
                    if(k == 0 && nums[k+1] == 0){
                        hasZero = true;
                    }
                    nums[k] = nums[k+1];
                }
                nums[len-1] = temp;
            }
        }

    }
    */






}
