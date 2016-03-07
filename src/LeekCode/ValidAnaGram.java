package LeekCode;

import java.util.Arrays;

public class ValidAnaGram {

/*


Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

 */



    public static void main(String[] args){
        String s = "anagram";
        String t = "bagaram";

        System.out.println(isAnagram(s, t));





    }


    public static boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if(slen == tlen){
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            if(Arrays.equals(sChars, tChars)){
                return true;
            }
        }
        return false;
    }






}
