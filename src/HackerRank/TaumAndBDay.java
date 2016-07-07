package HackerRank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumAndBDay {


    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new StringReader(
                "10 10\n" + "1 1 1\n" +
                "5 9\n" + "2 3 4\n" +
                "3 6\n" + "9 1 1\n" +
                "7 7\n" + "4 3 1\n" +
                "3 3\n" + "1 9 2\n"
        ));


        //int t = in.nextInt();
        for(int a0 = 0; a0 < 5; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();


            System.out.println(b + " : " + w + " : " + x +" : " + y + " : " + z);

            findMinimumAmount(b, w, x, y, z);
        }
    }



    public static void findMinimumAmount(long b, long w, long x, long y, long z){
        long temp1 = (b * x) + (w * y);
        long temp2 = (b * x) + (w * (y + z));
        long temp3 = (b * (x + z)) + (w * y);
        long temp4 = (b * x) + (w * (x + z));
        long temp5 = (b * (y+z)) + (w * y);
        long newTemp1 = Math.min(temp1, temp2);
        long newTemp2 = Math.min(temp3, temp4);
        long newTemp3 = Math.min(newTemp1, newTemp2);
        long minimunAmount = Math.min(newTemp3, temp5);
        System.out.println(minimunAmount);
    }

}
