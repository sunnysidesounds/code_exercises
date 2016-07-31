package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class SaveThePrisoner {


    public static void main(String[] args){
        Scanner scanner = new Scanner(new StringReader(
                "1\n"
                + "5 8 3\n"));
        // Setup
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();


        //int[] arr = makeSequenceArr(n);
        //int out = findLastSweet(arr, s, m);
        int out1  = fintLastPoisonedSweet(n, s, m);

        //System.out.println(Arrays.toString(arr));



    }

    public static int fintLastPoisonedSweet(int n, int s, int m){
        int result;
        int i = 0;
        while(true){
            result = ((s + i - 1) % n) + 1;
            System.out.println(result);
            if(m == 1){
                break;
            }
            m--;
            i++;
        }
        return result;
    }




    public static int findLastSweet(int[] arr, int s, int m){
        int result = -1;
        if(m != 0){
            for (int i = 0; i < arr.length; i++) {
                result = arr[(s + i - 1) % arr.length];
                System.out.println(result);

                if (m == 1) {
                    System.out.println("m : " + m + " result : " + result);
                    break;
                }
                m--;
            }
        }
        return result;
    }

    public static int[] makeSequenceArr(int n){
        int[] result = new int[n];
        int count = 1;
        for(int i =0; i < n; i++){
            result[i] = count;
            count++;
        }
        return result;
    }




}
