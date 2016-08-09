package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class EqualStacks {

    /*
    three stacks of cylinders where each cylinder has the same diameter, but they may vary in height.

    Find the maximum possible height of the stacks such that all of the stacks are exactly the same height.
    This means you must remove zero or more cylinders from the top of zero or more of the three stacks until
    they're all the same height, then print the height. The removals must be performed in such a way as to
    maximize the height.

    The first line contains three space-separated integers, n1, n2, and n3, describing the respective number
    of cylinders in stacks 1, 2, and 3

    The second line n2 contains space-separated integers describing the cylinder heights in stack .  top to bottom

     */

    public static void main(String[] args) {
       /* Scanner in = new Scanner(new StringReader(
                "5 3 4\n"
                + "3 2 1 1 1\n"     //stack 1
                + "4 3 2\n"         //stack 2
                + "1 1 4 1\n"));    //stack 3
                */

        Scanner in = new Scanner(new StringReader(
                "5 2 3\n"
                        + "1 1 1 1 1\n"     //stack 1
                        + "3 2\n"         //stack 2
                        + "1 3 1\n"));    //stack 3


        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        System.out.println(findEqualStacks(h1, h2, h3));


    }
    public static int findEqualStacks(int[] stack1, int[] stack2, int[] stack3){
        int amount = -1;
        int[] st1 = sumArr(stack1);

        if (sum(stack1) != sum(stack2) && sum(stack1) != sum(stack3)) {
            HashMap<Integer, Integer> st2 = sumMap(stack2);
            HashMap<Integer, Integer> st3 = sumMap(stack3);
            for(int i = 0; i < st1.length; i++){
                int n = st1[i];
                if(st2.containsKey(n) && st3.containsKey(n)){
                    amount = n;
                    break;
                }
            }

        } else {
            amount = sum(stack1);

        }
        return amount;
    }

    public static int sum(int[] stack){
        int sum = 0;
        for(int i = 0; i < stack.length; i++){
            sum = sum + stack[i];
        }
         return sum;
    }

    public static int[] sumArr(int[] stack){
        int total = sum(stack);
        int[] sum = new int[stack.length];

        for(int i = 0; i < sum.length; i++){
            int n2 = stack[i];
            total = total -n2;
            sum[i] = total;

        }
        return sum;
    }

    public static HashMap<Integer, Integer> sumMap(int[] stack){
        int total = sum(stack);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < stack.length; i++){
            int n2 = stack[i];
            total = total -n2;
            map.put(total, total);
        }
        return map;
    }


}
