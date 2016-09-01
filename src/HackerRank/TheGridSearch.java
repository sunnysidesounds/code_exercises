package HackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TheGridSearch {


    public static void main(String[] args) {
        File file = new File("/Users/jasonalexander/Desktop/input07-thegridsearch.txt");

        try {
            Scanner in = new Scanner(file);

       /* Scanner in = new Scanner(new StringReader(
                "2\n"
                + "10 10\n"
                    + "7283455864\n"
                    + "6731158619\n"
                    + "8988242643\n"
                    + "3830589324\n"
                    + "2229505813\n"
                    + "5633845374\n"
                    + "6473530293\n"
                    + "7053106601\n"
                    + "0834282956\n"
                    + "4607924137\n"
                + "3 4\n"
                        + "9505\n"
                        + "3845\n"
                        + "3530\n"
                + "15 15\n"
                        + "400453592126560\n"
                        + "114213133098692\n"
                        + "474386082879648\n"
                        + "522356951189169\n"
                        + "887109450487496\n"
                        + "252802633388782\n"
                        + "502771484966748\n"
                        + "075975207693780\n"
                        + "511799789562806\n"
                        + "404007454272504\n"
                        + "549043809916080\n"
                        + "962410809534811\n"
                        + "445893523733475\n"
                        + "768705303214174\n"
                        + "650629270887160\n"
                        + "2 2\n"
                        + "99\n"
                        + "99\n"
        ));
        */


            int t = in.nextInt();
            for (int a0 = 0; a0 < t; a0++) {
                int R = in.nextInt();
                int C = in.nextInt();
                String G[] = new String[R];
                for (int G_i = 0; G_i < R; G_i++) {
                    G[G_i] = in.next();
                }

                //System.out.println(Arrays.toString(G));

                int r = in.nextInt();
                int c = in.nextInt();
                String P[] = new String[r];
                for (int P_i = 0; P_i < r; P_i++) {
                    P[P_i] = in.next();
                }


                //System.out.println(Arrays.toString(P));
                String value = contains2DPattern(G, P) ? "YES" : "NO";
                System.out.println(value);


            }


        }catch (FileNotFoundException e) {
                e.printStackTrace();
        }

    }


    public static boolean contains2DPattern(String[] gridArray, String[] patternArray){
        boolean containsMatch = false;
        if(gridArray.length > 0 && patternArray.length > 0){
            int j = 0;
            String gridLine;
            for(int i = 0 ; i < gridArray.length; i++){
                gridLine = gridArray[i];
                ArrayList<Integer> occurances = getAllOccurances(gridLine, patternArray[j]);
                if(occurances.size() > 0){
                    for(int x = 0; x < occurances.size(); x++){
                        if(determinePatternMatch(gridArray, patternArray, i, occurances.get(x))){
                          containsMatch = true;
                            break;
                        }
                    }
                }
            }

        }
        return containsMatch;
    }

    public static boolean determinePatternMatch(String[] gridArray, String[] patternArray, int startIndex, int gridIndex){
        boolean isMatched = false;
        int endIndex = startIndex + (patternArray.length -1);
        if(endIndex >= gridArray.length){
            endIndex = gridArray.length-1;
        }

        int j = 0;
        int currentIndex = -1;
        int count = 1;
        for(int i = startIndex; i <= endIndex; i++){
            String row = gridArray[i];
            String pattern = patternArray[j];
            int index = gridIndex;
            if(index != -1){
                 String subStr = row.substring(index, index + pattern.length());
                if(subStr.equals(pattern)){
                    isMatched = true;
                } else {
                    isMatched = false;
                    break;
                }
                //System.out.println("index : " + index + " pattern : " + pattern + " match : " + subStr);
                j++;
            }
        }


        return isMatched;
    }


    public static ArrayList<Integer> getAllOccurances(String row, String pattern){
        ArrayList<Integer> occurances = new ArrayList<Integer>();
        int index = row.indexOf(pattern);
        while(index >= 0) {
            occurances.add(index);
            index = row.indexOf(pattern, index+1);
        }
       return occurances;
    }

}
