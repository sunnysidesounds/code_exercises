package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {


    public static void main(String[] args){

        Scanner scan = new Scanner(new StringReader(
                "2\n"
                        + "hello\n"
                        + "world\n"
                        + "hi\n"
                        + "world\n"

        ));

        int N = scan.nextInt();
        for(int i = 0; i < N; i++){
            String a = scan.next();
            String b = scan.next();
            System.out.println(findCommonSubstring(a, b));

            //System.out.println("a : " + a + " b : " + b );



        }


        /*
        {
        if(firstWord.indexOf(c) > -1 && secondWord.indexOf(c) > -1)
        flag = "YES";
    }
         */



    }

    public static String findCommonSubstring(String a, String b){
        String answer = "NO";
        if(a.length() > 0 || b.length() > 0){
            char[] charList = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            for(char c : charList){
                if(a.indexOf(c) > -1 && b.indexOf(c) > -1){
                    answer = "YES";
                    break;
                }
            }
        }
        return answer;
    }


    public static String findCommonSubString(String a, String b){

        int containsCount = 0;
        if(a.length() > 0 || b.length() > 0){
            int largerLength;
            String larger;
            String smaller;
            if(a.length() > b.length()){
                largerLength = a.length();
                larger = a;
                smaller = b;
            } else {
                largerLength = b.length();
                larger = b;
                smaller = a;
            }
            for(int i = 0; i < largerLength; i++){
                String current = String.valueOf(larger.charAt(i));
                if(smaller.contains(current)){
                    System.out.println("c : " + current + " b : " + b );
                    containsCount++;
                }
            }
        }
        return containsCount > 0 ? "YES" : "NO";
    }






}
