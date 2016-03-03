package LeekCode;

import java.util.Arrays;

public class RotateArray {

    /*

    Rotate an array of n elements to the right by k steps.

    For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

    Note:
    Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.


    Hint:
    Could you do it in-place with O(1) extra space?

    Related problem: Reverse Words in a String II


     */

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7};
        int index = 3;

        rotate(numbers, index);






    }


    public static void rotate(int[] nums, int k) {


        if (nums == null || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }


            for(int i = 0; i < k; i++){
                for(int j = nums.length-1; j > 0; j--){
                    int t = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = t;
                }
            }






        System.out.println(Arrays.toString(nums));





    }





}
