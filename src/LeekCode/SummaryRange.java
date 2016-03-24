package LeekCode;

import java.util.*;

public class SummaryRange {
    /*
    Given a sorted integer array without duplicates, return the summary of its ranges.
    For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
    */

    public static void main(String[] args){
        //int[] nums = {0,1,2,4,6,7,10,12,13,15,16,18};
        int[] nums = {1, 3};
        System.out.println(summaryRanges(nums));
    }


    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<String>();
        String range;

        if(nums.length == 0){
            return list;
        }
        if(nums.length == 1){
            range = "" + nums[0];
            list.add(range);
        }
        int start = nums[0];
        int end = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] == 1){
                end = nums[i];
                if(i == nums.length-1){
                    System.out.println("1");
                    range = start + "->" + end;
                    list.add(range);
                }
            } else {
                if(start == end){
                    range = "" + nums[i-1];
                    list.add(range);
                } else {
                    if(end != 0){
                        range = start + "->" + end;
                        list.add(range);
                    } else {
                        range = "" + start;
                        list.add(range);
                    }
                }

                if(i == nums.length-1){
                    range = "" + nums[i];
                    list.add(range);
                }
                start = nums[i];
            }
            end = nums[i];
        }

        return list;
    }


}
