package HackerRank;

import java.io.StringReader;
import java.util.*;

public class DivisibleSumPairs {


    public static void main(String[] args){

        Scanner in = new Scanner(new StringReader(
            "6 3\n"
                + "1 3 2 6 1 2\n" // sorted : 1, 1, 2, 2, 3, 6

        ));

        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        System.out.println(findDiviblePairs(a, k));


    }


    public static int bsearch(int[] a, int low, int high, int x){
        if(high >= low){
            int middle = low + (high - low) / 2;
            if(x == a[middle]){
                return middle;
            } else if(x > a[middle]){
                return bsearch(a, (middle + 1), high, x);
            } else {
                return bsearch(a, low, (middle - 1), x);
            }
        }
        return -1;

    }


    public static int[] removeDuplicates(int[] arr) {
        int end = arr.length;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < end; i++){
            set.add(arr[i]);
        }
        int[] a = new int[set.size()];
        Iterator it = set.iterator();
        int i =0;
        while(it.hasNext()) {
            a[i] = Integer.valueOf(it.next().toString());
            i++;
        }
        return a;
    }




    public static int findDiviblePairs(int[] a, int k){
        Arrays.sort(a);
        a = removeDuplicates(a);
        int n = a.length;
        int count = 0;

        System.out.println(Arrays.toString(a));

        for(int i = 0; i < n; i++){
            int left = a[i];
            System.out.println("left : " + left);
            for(int j = n-1; j > 0; j--){
                int right = a[j];
                System.out.println("  left : " + left + " right : " + right + " sum : " + (left + right) + " mod : " + (left+right) % k);
                if((left+right) % k == 0){
                    count++;
                }

            }


        }



        return count;
    }




}
