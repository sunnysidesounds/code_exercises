package Array;

/*
In an array 1-100 many numbers are duplicates, how do you find it?
 */

import java.util.*;

public class findAllDuplicatesInArray {

    public static void main(String[] args){

        int[] duplicatesArrays = {
                1, 2, 4, 5, 6, 7, 5, 8, 9, 10,
                50, 34, 50, 67, 89, 1, 34, 56,
                100, 23, 45, 65, 45, 67, 77, 88,
                34, 56, 40, 23, 65, 34, 12, 67,
                12, 10, 45, 67, 88, 99, 100, 23,
                67, 45, 33, 45, 65, 12, 34, 88,
                50, 34, 66, 55, 53, 52, 51, 49,
                21, 22, 39, 89, 29, 49, 59, 69,
                78, 55, 41, 78, 90, 34, 93, 11,
                88, 97, 98, 31, 39, 64, 45, 80
        };

        System.out.println(Arrays.toString(duplicatesArrays));
        System.out.println("Duplicate values are: " + findAllDuplicates(duplicatesArrays));
        System.out.println("Remove Duplicates: " + removeDuplicate(duplicatesArrays));

    }

    public static List<Integer> findAllDuplicates(int[] array){
        int len = array.length;
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        ArrayList<Integer> checkedValues = new ArrayList<Integer>();
        for(int arr : array){
            if(checkedValues.contains(arr) && !duplicates.contains(arr)){
                duplicates.add(arr);
            } else {
                checkedValues.add(arr);
            }
        }
        return duplicates;
    }

    public static List<Integer> removeDuplicate(int[] array){
        ArrayList<Integer> values = new ArrayList<Integer>();
        for(int item: array){
            if(!values.contains(item)){
                values.add(item);
            }

        }
        return values;
    }



}
