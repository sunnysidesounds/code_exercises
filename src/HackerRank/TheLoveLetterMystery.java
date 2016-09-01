package HackerRank;

import java.io.StringReader;
import java.util.Scanner;

public class TheLoveLetterMystery {


    public static void main(String[] args) {

       /* Scanner scan = new Scanner(new StringReader(
                "4\n"
                        + "abc\n"
                        + "abcba\n"
                        + "abcd\n"
                        + "cba\n"

        )); */

        Scanner scan = new Scanner(new StringReader(
                "4\n"
                        + "az\n"
                        + "abcbassa\n"
                        + "abcddfa\n"
                        + "cbaaabe\n"

        ));

        for(char c = 'A'; c <= 'Z'; c++){
            int ii = c;
            System.out.println(c + " : " + ii);


        }



        int T = scan.nextInt();
        for(int i = 0; i < T; i++){
            String word = scan.next();
            System.out.println("word : " + word + " isPalindrone : " + isPalindrone(word));
            System.out.println("MIN COUNT : " + findMinConversionToPalindrone(word) + " \n");

        }



    }

    public static int findMinConversionToPalindrone(String s){
        int count = 0;
        int len = s.length();
        if(isPalindrone(s) || len == 1){
            return count;
        }
        for(int i = 0, j = len-1; i<=len-1 && j>=0; i++, j--){
            char letterA = s.charAt(i);
            char letterB = s.charAt(j);

            // find the larger char, then reduce to equal small char, repeat
            int difference = Math.abs((letterA - letterB));
            System.out.println("  d : " + difference);
            count = count + difference;

            System.out.println("  letter A : " + letterA + " letter B : " + letterB);
        }







        System.out.println("original count : " + count);
        return (count/2);
    }


    public static boolean isPalindrone(String s){
        boolean isPalindrone = false;
        String originalString = s;
        StringBuilder newString = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            newString.append(originalString.charAt(i));
        }
        if(originalString.equals(newString.toString())){
            isPalindrone = true;
        }
        return isPalindrone;
    }



}
