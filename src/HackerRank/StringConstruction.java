package HackerRank;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Scanner;

public class StringConstruction {


    /*

    s  = string
    m = lowercase letters that she wants to copy into a new string, p
    p = new string

    - append character at the end, cost of dollar
    - append any substring of p to the end at no cost.

    Given strings (i.e. s0,s1 ), find and print the minimum cost of copying each to si on pi a new line.



     */


    public static void main(String[] args) {
        Scanner in = new Scanner(new StringReader(
                "2\n"
                + "abcd\n"
                + "ababb\n"));


        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            //System.out.println("s : " + s);
            System.out.println(findMinminumCost(s));

        }



    }

    public static int findMinminumCost(String s){
        HashSet<Character> hs = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            hs.add(s.charAt(i));

        }
        return hs.size();
    }






}
