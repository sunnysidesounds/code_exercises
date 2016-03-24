package LeekCode;

import java.util.Arrays;

public class PlusOne {

    /*

    Given a non-negative number represented as an array of digits, plus one to the number.

    The digits are stored such that the most significant digit is at the head of the list.

     left most = most significant digit;

     */

    public static void main(String[] args){
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(nums)));


    }



    public static  int[] plusOne(int[] digits) {
        int number = 0;
        for(int i = 0; i < digits.length; i++){
            number += digits[i] * Math.pow(10, digits.length-i-1);

            System.out.println(digits[i]);
        }
        number = number + 1;
        String strDigit = Integer.toString(number);
        int[] out = new int[strDigit.length()];
        for(int k = 0; k < strDigit.length(); k++){
             out[k] = strDigit.charAt(k) - '0';
        }
        digits = out;
        return digits;
    }




}
