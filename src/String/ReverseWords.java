package String;

/*
 Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

    What constitutes a word?
    A sequence of non-space characters constitutes a word.
    Could the input string contain leading or trailing spaces?
    Yes. However, your reversed string should not contain leading or trailing spaces.
    How about multiple spaces between two words?
    Reduce them to a single space in the reversed string.

 */

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args){

        String str = "hi!";
        System.out.println(reverseWords(str));


    }


    public static String reverseWords(String s) {
        String str = s.trim();
        String[] strArray = str.split("[\\s]");
        StringBuilder sb = new StringBuilder();

        System.out.println(Arrays.toString(strArray));

        for(int i = strArray.length-1; i>=0; i--){
            if(!strArray[i].trim().equals("")) {
                if(i != 0){
                    sb.append(strArray[i]).append(" ");
                } else {
                    sb.append(strArray[i]);
                }
            }


        }
        return sb.toString();
    }

}
