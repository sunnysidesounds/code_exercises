package LeekCode;

import java.util.*;

public class RomanToInteger {

    /*

    Given a roman numeral, convert it to an integer.
    Input is guaranteed to be within the range from 1 to 3999.

     */

    public static void main(String[] args){
           String str = "DCXXI";
           //String str = "MCM";
        System.out.println("Your number is " + romanToInt(str));

    }



    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = romanMap();
        int result = 0;
        int previous = 0;
        for(int i = s.length()-1; i >= 0; i--){
            int current = map.get(s.charAt(i));
            if(current < result && current != previous){
                result -= current;
                previous = current;

            } else {
                result += current;
                previous = current;
            }

        }

        return result;
    }



    public static HashMap<Character, Integer> romanMap(){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        //map.put("IV", 4);
        map.put('V', 5);
        //map.put("IX", 9);
        map.put('X', 10);
        //map.put("XL", 40);
        map.put('L', 50);
        //map.put("XC", 90);
        map.put('C', 100);
        //map.put("CD", 400);
        map.put('D', 500);
        //map.put("CM", 900);
        map.put('M', 1000);
        return map;
    }








}
