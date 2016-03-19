package LeekCode;

import java.util.HashMap;

public class WordPattern {



    /*
    Given a pattern and a string str, find if str follows the same pattern.

    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

    Examples:

    pattern = "abba", str = "dog cat cat dog" should return true.
    pattern = "abba", str = "dog cat cat fish" should return false.
    pattern = "aaaa", str = "dog cat cat dog" should return false.
    pattern = "abba", str = "dog dog dog dog" should return false.

    Notes:
    You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.

    // key in map
    // not in map

     */




    public static void main(String[] args){
        String[] patternArray = {
                "abba",
                "abba",
                "aaaa",
                "abba",
                "abbad"};
        String[] stringArray = {
                "dog cat cat dog",
                "dog cat cat fish",
                "dog cat cat dog",
                "dog dog dog dog",
                "dog cat cat dog fish"};

        for(int i = 0; i < patternArray.length; i++){
            System.out.println("Pattern : " + patternArray[i] + " String : " + stringArray[i] + " Matches : "
                    + wordPattern(patternArray[i], stringArray[i]));

        }

        int number = 4;
        System.out.println((number & -number));


    }


    public static boolean wordPattern(String pattern, String str) {
        char[] patternList = pattern.toCharArray();
        String[] stringList = str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();


        if(patternList.length == stringList.length){
            boolean isTrue = true;
            for(int i = 0; i < patternList.length; i++){
                char pValue = patternList[i];
                String sValue = stringList[i];

                if(!map.containsKey(pValue) && !map.containsValue(sValue)){
                    map.put(pValue, sValue);
                    System.out.println("key " + pValue + " : " + map.get(pValue) + " : " + sValue + " inserted");

                } else {
                    String mapValue = map.get(pValue);

                    if(mapValue == null || !mapValue.equals(sValue)){
                        isTrue = false;
                    }



                    System.out.println("key " + pValue + " : " + mapValue + " : " + sValue + " already in map");




                }

            }

            System.out.println(map);

            return isTrue;
        }

        return false;

    }






}
