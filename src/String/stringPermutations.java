package String;

import java.util.*;

public class stringPermutations {


    public static void main(String[] args){
        String s = "abc";
        System.out.println(executePermutation(s));
    }

    public static Set<String> executePermutation(String s){
        Set<String> result = new HashSet<String>();
        if(s == null){
            return null;
        } else if (s.length() == 0){
            result.add("");
            return result;
        }
        char firstCharacter = s.charAt(0);
        String remaingWords = s.substring(1);
        Set<String> words = executePermutation(remaingWords);
        for(String newString : words){
            for(int i = 0; i <= newString.length(); i++){
                String first = newString.substring(0, i);
                String last = newString.substring(i);
                result.add(first + firstCharacter + last);
            }
        }

        return result;
    }

}
