package HackerRank;

import java.io.StringReader;
import java.util.*;

public class LuckBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new StringReader(
                "6 3\n"
                + "5 1\n"
                + "2 1\n"
                + "1 1\n"
                + "8 1\n"
                + "10 0\n"
                + "5 0\n"));
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int total = 0;
        List<Integer> importantContests = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
            int luck = scanner.nextInt();
            int importance = scanner.nextInt();
            total += luck;
            if (importance == 1) {
                importantContests.add(luck);
            }
        }
        Collections.sort(importantContests);
        int luckToFlip = 0;
        int mustWinImprCount = importantContests.size() - k;
        for (int i=0; i<mustWinImprCount; i++){
            luckToFlip += importantContests.get(i);
        }
        int result = total - 2*luckToFlip;
        System.out.println(result);
    }


}
