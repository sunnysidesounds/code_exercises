package Array;

import java.util.*;

public class PascalsTriangle {

    public static void main(String[] args){
        int max = 30;
        //generateTriangle(max);

        System.out.println(getRow(max));


    }


    public static void generateTriangle(int max){
        int r;
        int value;

        for(int i = 0; i <= max; i++){
            r = i + 1;
            //System.out.println("Row: " + r);

            value = 1;
            for(int j = 0; j <= i; j++){
                if(j > 0){
                    value = value * (r-j)/j;
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

   /*
           Given numRows, generate the first numRows of Pascal's triangle.

        For example, given numRows = 5,
        Return

        [
             [1],
            [1,1],
           [1,2,1],
          [1,3,3,1],
         [1,4,6,4,1]
        ]

    */


    public static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> parent = new ArrayList<List<Integer>>();
        int r;
        int value;
        for(int i = 0; i <= numRows-1; i++){
            ArrayList<Integer> child = new ArrayList<Integer>();

            r = i + 1;
            value = 1;
            for(int j = 0; j <= i; j++){
                if(j > 0){
                    value = value * (r-j) / j;
                }
                child.add(value);
            }
            parent.add(child);
        }
        return parent;
    }


    /*
    Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
     */

    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> parent = new ArrayList<Integer>();

        int row = rowIndex + 1;
        int value = 1;
        for(int c = 0; c <= rowIndex; c++){

            if(c > 0){
                System.out.println(value);


                value = value * ((rowIndex+1)-c) / c;
            }
            parent.add(value);

        }
      return parent;
    }


}
