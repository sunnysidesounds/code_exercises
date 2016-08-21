package HackerRank;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class LonelyInteger {


    public static void main(String[] args){

        Scanner in = new Scanner(new StringReader(
                "3\n" + "1 1 2\n"));


        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
           // System.out.println(_a_item);


        }


        res = lonelyInteger(_a);
        System.out.println(res);

    }



    public static int lonelyInteger(int[] a){

        Set<Integer> set = new HashSet();
        int result = 0;
        for (int e : a) {
            result -= e;

            set.add(e);
        }
        for (int e : set) {
            result += 2*e;
        }
        return result;
    }


}
