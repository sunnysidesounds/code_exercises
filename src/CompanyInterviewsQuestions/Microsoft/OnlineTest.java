package CompanyInterviewsQuestions.Microsoft;

import java.util.*;

public class OnlineTest {


    public static void main(String[] args){
        int m = 5;

        int[] arr = {-5, 1, 2, 6, 6, 9};

        printSumPairs(arr, m);


    }


    public static void printSumPairs(int []input, int k){
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        boolean hasPair = false;

        for(int i=0;i<input.length;i++){

            if(pairs.containsKey(input[i])) {
                hasPair = true;
                System.out.println(pairs.get(input[i]) + " + " + input[i] + " = " + k);

            }else {
                pairs.put(k - input[i], input[i]);
            }
        }


        if(!hasPair){
            System.out.print("no pair");
        }



    }



}
