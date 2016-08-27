package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {


    public static void main(String[] args) {

        Scanner scan = new Scanner(new StringReader(
                "1\n"
                        + "5\n"
                        + "ebacd\n"
                        + "fghij\n"
                        + "olmkn\n"
                        + "trpqs\n"
                        + "xywuv\n"

        ));


        /*

        Rows Traversal
        [1][i]
        [2][i]
        [3][i]

        Columns Traversal
         [i][1]
         [i][2]

         */


        int T = scan.nextInt();


        for(int z = 0; z < T; z++) {
            System.out.println("Test " + z );
            int N = scan.nextInt();
            char[][] G = new char[N][N];
            int row = 0;
            for (int i = 0; i < N; i++) {
                char[] line = scan.next().toCharArray();
                for (int j = 0; j < N; j++) {
                    char lineValue = line[j];
                    G[row][j] = lineValue;
                }
                row++;
            }

            System.out.println("Original : " + Arrays.deepToString(G) + "\n");

            System.out.println("\nValue is : " + isLexicographicallySorted(G));


        }





    }


    public static boolean isLexicographicallySorted(char[][] G){
        int len = G.length;
        for(int i = 0; i < len; i++){
            for(int j = len-1; j > 0; j--){
                System.out.println(G[i][j-1] + " : " + G[i][j]);

                for(int x = 0; x < j; x++){
                    char val1 = G[i][x];
                    char val2 = G[i][x+1];
                    System.out.println(val1 + " : " + val2);
                    if(val1 > val2){
                        System.out.println("  val1 : " + val1 + " val2 : " + val2);
                        char temp = G[i][x];
                        G[i][x] = G[i][x+1];
                        G[i][x+1] = temp;
                        System.out.println("  do swap : " + Arrays.deepToString(G));
                    }
                }


            }
            System.out.println("-");

        }


        System.out.println("Sorted 2D Array : " + Arrays.deepToString(G));
        return isValid(G);
    }


    public static boolean isValid(char[][] G){
        for(int i=0;i<G.length;i++){
            for(int j=0;j<G.length-1;j++){
                if(G[j][i]>G[j+1][i]) return false;
            }
        }
        return true;
    }






    /*

     public void bubbleSort(){
          int out, in;
          for (out=nElems-1; out>1; out--){
                for(in=0; in<out; in++){
                    if(a[in] > a[in + 1]{
                         //swap
                         int temp = a[in];
                         a[in] = a[in+1];
                         a[in+1] = temp;
                    }
               }
          }
     }



    public static int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

        public void selectionSort(){
          int out, in;
          for(out = 0; out<nElems-1; out++){
               min = out;
               for(in=out+1; in<nElems; in++){
                    if(a[in] < a[min]{
                         min = in;
                    }
               }
               //swap
               int temp = a[in];
               a[in] = a[in+1];
               a[in+1] = temp;
          }
     }

     */



}
