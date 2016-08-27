package HackerRank;

import java.io.StringReader;
import java.util.Scanner;

public class AlternatingCharacters {


    public static void main(String[] args) {

        Scanner scan = new Scanner(new StringReader(
                "10\n"
                    + "ABABBABAAB\n"    // 2
                    + "BABAABBAAB\n"    // 3
                    + "AAAABBAAAA\n"    // 7
                    + "BABBABABBA\n"    // 2
                    + "AABBBBAAAA\n"    // 7
                    + "BAAAABBBBB\n"    // 7
                    + "BBABAAAABB\n"    // 5
                    + "BBBAAABBAB\n"    // 5
                    + "BABAAABBBB\n"    // 5
                    + "AAAABAABBB\n"    // 6

        ));

        int T = scan.nextInt();
        for(int i = 0; i < T; i++){
            String characters = scan.next();
            System.out.println(characters + " : " + findMinimumDeletions(characters));

        }

        /*
        AB AB BA BA AB

         */


    }

    public static String findPattern(String str){
        for(int i = 0; i < str.length(); i++){
            String s = str.substring(i, i+2);
            if(s.equals("AB")){
                return "AB";
            }
            if(s.equals("BA")){
                return "BA";
            }
        }
         return "NONE";
    }


    public static int findMinimumDeletions(String str){
        int min = 0;
        int len = str.length();
        if(!str.contains("B") || !str.contains("A")){
            min = len - 1;
        } else {
            String pattern = "";
            for(int i = 0; i < len-1; i+=2){
                String s = str.substring(i, i+2);
                if(pattern.equals("") && pattern.equals("AB")){
                    pattern = "AB";
                    System.out.println("   s not : " + s);
                }
                System.out.println(" s : " + s);




            }

        }
        return min;
    }






}
