package HackerRank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new StringReader(
                "4523 8092 9419 8076\n"
        ));


        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        findMatch(1, x1, v1, x2, v2);
        //System.out.println(match);
    }

    public static void findMatch(int count, int x1, int v1, int x2, int v2){
        if(count > 10000) {
            System.out.println("NO");
        }else if((x2 > x1) && (v2 > v1)){
            System.out.println("NO");
        } else if(x1 == x2) {
            System.out.println("YES");
        } else {
                x1 = x1 + v1;
                x2 = x2 + v2;
                count = count + 1;
                //System.out.println(count);
                findMatch(count, x1, v1, x2, v2);
        }
    }
}
