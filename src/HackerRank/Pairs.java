package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class Pairs {


    public static void main(String[] args) {

        Scanner in = new Scanner(new StringReader(
                "5 2\n"
                        + "1 5 3 4 2\n"

        ));
        int res;

        String n = in.nextLine();
        String[] n_split = n.split(" ");

        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);

        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = pairs(_a,_k);
        System.out.println(res);






    }





    public static int pairs(int[] a, int k){
        int count = 0;
        if(a.length < 2){
            return count;
        } else {
            Arrays.sort(a);
            for(int i = 0; i < a.length; i++){
                if(binarySearch(a, i+1, a.length-1, a[i] + k) != -1){
                    count++;
                }
            }
        }
        return count;
    }


    public static int binarySearch(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low)/2;
            if (x == arr[mid])
                return mid;
            if (x > arr[mid])
                return binarySearch(arr, (mid + 1), high, x);
            else
                return binarySearch(arr, low, (mid -1), x);
        }
        return -1;
    }



}
