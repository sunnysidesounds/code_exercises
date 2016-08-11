package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class FairRations {

    public static void main(String[] args) {

        Scanner in = new Scanner(new StringReader(
                "1\n" + "1 2\n"));

        int N = in.nextInt();
        int B[] = new int[N];
        int sum = 0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            sum += B[B_i];
        }


        if(sum % 2 == 1){
            System.out.println("NO");
        } else {
            System.out.println(minimumNumberOfLoafs(B));
        }



        System.out.println(Arrays.toString(B) + " sum: " + sum);

    }


    public static int minimumNumberOfLoafs(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            int val = array[i];
            if(val % 2 != 0){
                array[i] = array[i] + 1;
                array[i+1] = array[i+1] + 1;
                count+=2;

            }
        }
        return count;
    }



}
