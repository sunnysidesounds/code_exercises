package Array;


import sun.jvm.hotspot.oops.Array;

import java.util.*;


/*
In an array 1-100 exactly one number is duplicate how do you find it?
 */

public class findOneDuplicateInArray {

    public static void main(String[] args){

        //Add test data for problem
        int duplicateNumber = 34;
        int indexToDuplicate = 10;
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++){
            if((indexToDuplicate) == i){
                arr[i] = duplicateNumber;
            } else {
                arr[i] = i+1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("1) Duplicate number is: " + findDuplicate(arr));
        System.out.println("2) Duplicate number is: " + findDuplicate2(arr));
    }

    // O(n2)
    public static int findDuplicate(int[] array){
        int len = array.length;
        for(int i = 0; i < len; i++){
            for(int j = (i+1); j<len; j++){
                if(i != j && array[i] == array[j]){
                    return array[i];
                }
            }
        }
        return -1;
    }

    // O(n)
    public static int findDuplicate2(int[] array){
        int len = array.length;
        ArrayList<Integer> checkArr = new ArrayList<Integer>();
        for(int i =0; i < len; i++){
            if(checkArr.contains(array[i])){
               return array[i];
            } else {
                checkArr.add(array[i]);
            }
        }
        return -1;
    }


}
