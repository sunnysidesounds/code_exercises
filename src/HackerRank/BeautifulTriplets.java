package HackerRank;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BeautifulTriplets {


    public static void main(String[] args){
        Scanner scanner = new Scanner(new StringReader(
                "7 3\n"
                + "1 2 4 5 7 8 10\n"));
            // Setup
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = scanner.nextInt();
            }

            System.out.println(Arrays.toString(a));
            System.out.println(countBeautifulTriplets(a, d));

    }

    public static int countBeautifulTriplets(int[] a, int d){
        int count = 0;
        for(int z = 0; z < a.length; z++){
            int i = a[z];
            for(int x = z+1; x < a.length; x++){
                int j = a[x];
                if(j - i == d){
                    for(int y = x+1; y < a.length; y++){
                        int k = a[y];
                        if(k - j == d){
                            System.out.println("i : " + i + " j : " + j + " k : " + k);
                            count++;
                        }



                    }
                }


            }

        }
         return count;
    }





}
