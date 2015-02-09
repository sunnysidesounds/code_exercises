package String;

import java.util.*;

/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.
For example,
Given s = "Hello World",
return 5.




 */

public class LengthOfLastWord {

    public static void main(String[] args){
        String s = "   a";

        int count = lengthOfLastWord(s);

        System.out.println("Length of last word: " + count);

    }


    public static int lengthOfLastWord(String s) {
        if(s.length() == 0){
            return 0;
        }

        String newString = s.trim();
        String[] stringArray = newString.split(" ");
        int length = stringArray.length;
        return stringArray[length-1].length();
    }


}
