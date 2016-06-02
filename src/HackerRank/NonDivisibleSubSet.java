package HackerRank;

import java.util.*;

public class NonDivisibleSubSet {


    public static void main(String[] args){

        int k = 3;
        int[]n = {1, 7, 2, 4};

        System.out.println(nonDivisbleSubset(n, k));
        System.out.println(hasSum2(n, k));

    }

    public static int nonDivisbleSubset(int[] n, int k){


        boolean result = false;
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                ++count;
                if (n[i] + n[j] == k) {
                    System.out.println(n[i] + " + " + n[j]);
                    break;
                }
            }
        }
        System.out.println("Number of times looped = " + count);












         return 0;




    }


    //loops through maximum of 6 times
    public static int hasSum2(int[] inputNumbers, int sum) {
        boolean result = false;
        Set<Integer> setNumbers = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            ++count;
            if (inputNumbers[i] >= sum) {
                continue;
            }
            int neededNumber = sum - inputNumbers[i];
            if (setNumbers.contains(inputNumbers[i])) {
                System.out.println(inputNumbers[i] + " + " + neededNumber);
                break;
            } else {
                setNumbers.add(neededNumber);
            }
        }

        System.out.println("Number of times looped = " + count);
        return 0;

    }




}
