package HackerRank;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Scanner;

public class ReduceString {


    public static void main(String[] args) {

        Scanner in = new Scanner(new StringReader(
                "baab\n"));

        String s = in.next();

        System.out.println(reduceString(s));

    }


    public static String reduceString(String s){
        String output = "";
        while(hasKey(s)){
            output = reduce(s);
            s = output;
        }
        return output.equals("") ? "Empty String" : output;
    }

    public static String reduce(String s){
        String key = "";
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i< s.length()-1; i++){
            String ss = s.substring(i, i+2);
            if(ss.charAt(0) == ss.charAt(1)){
                key = ss;
                break;
            }
        }
        int index = s.indexOf(key);
        sb.delete(index, index + 2);
        return sb.toString();
    }

    public static boolean hasKey(String s){
        boolean key = false;
        for(int i = 0; i< s.length()-1; i++){
            String ss = s.substring(i, i+2);
            if(ss.charAt(0) == ss.charAt(1)){
                key = true;
                break;
            }
        }
        return key;
    }






    public static String reduceStringaa(String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuilder out = new StringBuilder();
        for(int i = 0; i< sb.length(); i+=2){
            StringBuilder ss = new StringBuilder();
            String sub;
            if(i == sb.length() -1){
                sub = sb.substring(i, i+1);
            } else {
                sub = sb.substring(i, i+2);
            }
            ss.append(sub);
            if(sub.length() == 1){
                out.append(sub);
            } else if (!sub.equals(ss.reverse().toString())) {
                 out.append(sub);

            }

        }
        return out.toString();

    }

    public static String reduceStrings(String s){
        String out = "";
        for(int i = 0; i< s.length(); i+=2){
            String sub;
            if(i == s.length() - 1){
                sub = s.substring(i, i+1);
                out += sub;
            } else {
                sub = s.substring(i, i+2);
                if(sub.charAt(0) != sub.charAt(1)){
                    out += sub;
                }
            }

        }
        return out;
    }




}
