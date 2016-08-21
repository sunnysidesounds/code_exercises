package HackerRank;

import java.io.StringReader;
import java.util.*;

public class NonDivisibleSubSet {


    public static void main(String[] args){

       Scanner scan = new Scanner(new StringReader(
                "87 9\n" + "61197933 56459859 319018589 271720536 358582070 849720202 481165658 675266245 541667092 615618805 129027583 755570852 437001718 86763458 791564527 163795318 981341013 516958303 592324531 611671866 157795445 718701842 773810960 72800260 281252802 404319361 757224413 682600363 606641861 986674925 176725535 256166138 827035972 124896145 37969090 136814243 274957936 980688849 293456190 141209943 346065260 550594766 132159011 491368651 3772767 131852400 633124868 148168785 339205816 705527969 551343090 824338597 241776176 286091680 919941899 728704934 37548669 513249437 888944501 239457900 977532594 140391002 260004333 911069927 586821751 113740158 370372870 97014913 28011421 489017248 492953261 73530695 27277034 570013262 81306939 519086053 993680429 599609256 639477062 677313848 950497430 672417749 266140123 601572332 273157042 777834449 123586826\n"));

        /*Scanner scan = new Scanner(new StringReader(
                "4 3\n" + "1 7 2 4\n")); */


        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(nonDivisbleSubset(arr, K));
        //System.out.println(hasSum2(n, k));

        // Expect output : 5

    }

    public static int nonDivisbleSubset(int[] n, int k){
        int count = 0;
        SortedSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                System.out.println(n[i] + " + " + n[j]);
                if ((n[i] + n[j]) % k != 0) {
                    System.out.println("-- " + n[i] + " + " + n[j] + " = " + (n[i] + n[j]));
                    count++;
                    set.add(n[i]);
                    set.add(n[j]);
                    break;
                }

            }
        }

        System.out.println("set : " + set.toString());

         return set.size();
    }


    //loops through maximum of 6 times
    public static int hasSum2(int[] inputNumbers, int sum) {
        boolean result = false;
        Set<Integer> setNumbers = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            ++count;
            if (inputNumbers[i] >= sum) {
                continue;
            }
            int neededNumber = sum - inputNumbers[i];
            if (setNumbers.contains(inputNumbers[i])) {
                System.out.println(inputNumbers[i] + " + " + neededNumber);
                break;
            } else {
                setNumbers.add(neededNumber);
            }
        }

        System.out.println("Number of times looped = " + count);
        return 0;

    }




}
