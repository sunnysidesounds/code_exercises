package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class RichieRich {


    public static void main(String[] args) {

        Scanner in = new Scanner(new StringReader(
                "4 1\n" + "3943\n"));

        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();

        System.out.println("n : " + n + " k : " + k + " number : " + number);

        StringBuilder front = new StringBuilder(number.substring(0, number.length()/2));

        StringBuilder back = new StringBuilder(number.substring((number.length()/2)+(number.length()%2)));

        System.out.println(isPalindrone(number));
        System.out.println(largestPossibleAmount(number, k));





    }

    public static String largestPossibleAmount(String number, int k){
        String palindromeNumber = "-1";
        int[] changed = new int[(number.length() +1) / 2];

        if(number.length() % 2 == 1){
            changed[number.length() / 2] = 1;

        }

        char[] numberArray = number.toCharArray();
        for(int i = 0; i < number.length() / 2; i++){
            if(numberArray[i] == numberArray[number.length() - i - 1]){
                continue;
            }
            if (k--==0){
                changed[i] = 0;
                break;
            }

            changed[i] = 1;
            if (numberArray[i] > numberArray[number.length()-i-1]){
                numberArray[number.length()-i-1] = numberArray[i];
            } else {
                numberArray[i]=numberArray[number.length()-i-1];
            }

        }
        int idx = 0;
        while (k>0 && idx<changed.length){
            if (numberArray[idx]!='9' && k-(2-changed[idx])>=0){
                numberArray[idx] = '9';
                numberArray[number.length()-idx-1] = '9';
                k -= 2-changed[idx];
            }
            idx++;
        }
        if(k < 0){
            palindromeNumber = String.valueOf(k);
        } else {
            palindromeNumber = String.valueOf(numberArray);
        }
        return  palindromeNumber;
    }


    public static boolean isPalindrone(String number){
        boolean is = false;
        String front = number.substring(0, number.length()/2);
        String back = new StringBuilder(number.substring((number.length()/2)+(number.length()%2))).reverse().toString();
        if(back.equals(front)){
            is = true;
        }
        return is;
    }



}
