package LeekCode;

import java.util.*;

public class GroupAnagrams {



/*

Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]

 */

    public static void main(String[] args){
        //String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] s = {"tea","and","ate","eat","den"};
        //String[] s = {"", ""};

        System.out.println(groupAnagrams(s));





    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalList = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        if(strs.length > 0) {

            for (int i = 0; i < strs.length; i++) {
                String key;

                char[] strsChar = strs[i].toCharArray();
                Arrays.sort(strsChar);
                key = new String(strsChar);

                if (map.get(key) == null) {
                    List<String> list = new ArrayList<String>();
                    list.add(strs[i]);
                    map.put(key, list);
                } else {
                    List<String> createdList = map.get(key);
                    createdList.add(strs[i]);
                }

            }
            for (List<String> value : map.values()) {
                Collections.sort(value);
                finalList.add(value);

            }
        }


        System.out.println(map);


        return finalList;


    }



}

