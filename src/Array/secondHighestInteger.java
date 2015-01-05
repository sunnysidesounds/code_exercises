package Array;

/*
How do you find second highest number in an integer array?
 */

import java.util.Arrays;

public class secondHighestInteger {

    public static void main(String[] args){
        int[] list = {23, 56, 101, 46, 78};

        System.out.println("Original list: " + Arrays.toString(list));
        System.out.println("Second highest integer (with bubble sort): " + findSecondHighestWithSort(list));
        System.out.println("Second highest integer : " + findSecondHighest(list));


    }

    public static int findSecondHighestWithSort(int[] list){
        int len = list.length;
        for(int i = len-1; i >=0; i--){
            for(int j=0; j < i; j++){
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted list: " + Arrays.toString(list));
        return list[len-2];

    }

    public static int findSecondHighest(int[] list){
        int highest = 0;
        int secondHighest = 0;

        for(int item : list){
            if(item > highest){
                secondHighest = highest;
                highest = item;
            } else if (item > secondHighest){
                secondHighest = 1;
            }
        }
        return secondHighest;
    }
}
