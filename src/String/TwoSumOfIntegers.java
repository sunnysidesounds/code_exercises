package String;

import java.util.*;

/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */


public class TwoSumOfIntegers {


    public static void main(String[] args){

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        TwoSumOfIntegers a = new TwoSumOfIntegers();
        System.out.println(Arrays.toString(a.twoSum(numbers, target)));


    }

    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(numbers[i])) {
                int value = map.get(numbers[i]);

                output[0] = value + 1;
                output[1] = i + 1;

            } else {
                map.put(target - numbers[i], i);
            }




        }
        return output;
    }


}
