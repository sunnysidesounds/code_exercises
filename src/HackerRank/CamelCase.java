package HackerRank;

import java.io.StringReader;
import java.util.Scanner;

public class CamelCase {


    public static void main(String[] args){
        Scanner in = new Scanner(new StringReader(
                "saveChangesInTheEditor"));
        String s = in.next();


        System.out.println(countWordsInCamelCase(s));


    }


    public static int countWordsInCamelCase(String s){
        int result = -1;
        if(s.length() > 0) {
            int count = 1;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isUpperCase(c)) {
                    count++;
                }
            }
            result = count;
        }
        return result;
    }


}
