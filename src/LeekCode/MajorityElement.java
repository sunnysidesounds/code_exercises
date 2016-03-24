package LeekCode;

import java.util.Arrays;

public class MajorityElement {

    /*

    Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

    10/2 = 5 times


    You may assume that the array is non-empty and the majority element always exist in the array.

     */


    public static void main(String[] args){
        int[] nums = {1, 1, 1, 2, 3, 2, 5, 2, 2, 2, 8, 6, 2, 3, 2, 2, 2, 2};
        System.out.println(majorityElement(nums));


    }


    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int current = 0;
        int counter = 0;
        int threshold = (nums.length /2);

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                current = nums[i];
                counter++;
            } else {
                if(current == nums[i]){
                    current = nums[i];
                    counter++;
                } else {
                    if(counter > threshold){
                        return current;
                    } else {
                        counter = 1;
                        current = nums[i];

                    }
                }
            }
        }

        return current;
    };

}
