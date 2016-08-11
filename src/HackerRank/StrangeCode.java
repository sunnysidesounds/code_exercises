package HackerRank;

import java.io.StringReader;
import java.util.Scanner;

public class StrangeCode {

    public static void main(String[] args) {

/*        Scanner in = new Scanner(new StringReader(
                "5 2\n" + "0 4\n"));*/

        Scanner in = new Scanner(new StringReader(
                "999999766777\n"));


        long t = in.nextLong();

        System.out.println(t);

        //System.out.println(getStrangeCode(t));
        System.out.println(getStrangeCode2(t));







    }

    public static long getStrangeCode2(long t){
        long time=0;
        long value=3;
        long data = t;
        while ((time+value) < data)
        {
            time = time + value;
            value = value * 2;
        }
        time++;
        return value-(data-time);
    }


    public static int getStrangeCode(long t){
        int initialValue = 3;
        int value = 3;
        int second = 1;
        int returnValue = -1;

        while(value != 0){
            System.out.println("second : " + second + " value : " +  value);
            if(second == t){
                returnValue = value;
                break;
            }
            if(value == 1){
                value = (initialValue * 2);
                initialValue = value;
            } else {
                value--;
            }
            second++;

        }

        return returnValue;
    }




}
