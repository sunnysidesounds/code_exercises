package HackerRank;

import java.lang.reflect.Array;
import java.util.*;

public class NikitaAndTheGame {


    /*



input:

10 tests

42 : correct
0, 2, 0, 2, 0, 0, 0, 0, 2, 0, 0, 2, 2, 0, 2, 2, 2, 2, 0, 0, 0, 2, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 2, 0, 2, 0, 2, 0, 2, 2

24 : correct
2, 0, 0, 2, 2, 0, 0, 0, 0, 2, 0, 2, 0, 2, 0, 2, 0, 0, 0, 2, 0, 0, 2, 0

64 : correct
999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994, 999999994

70 : correct
1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0

103 : wrong
4096, 4096, 1024, 256, 256, 128, 128, 128, 128, 512, 512, 512, 512, 256, 256, 512, 512, 128, 32, 32, 32, 32, 128, 128, 1024, 1024, 2048, 512, 512, 1024, 2048, 2048, 1024, 512, 512, 2048, 2048, 2048, 16384, 16384, 2048, 256, 128, 128, 512, 256, 256, 512, 2048, 1024, 1024, 512, 512, 1024, 1024, 1024, 2048, 512, 512, 1024, 4096, 4096, 4096, 2048, 2048, 4096, 2048, 2048, 2048, 1024, 512, 256, 16, 16, 32, 64, 128, 2048, 512, 512, 512, 512, 8192, 8192, 32768, 32768, 65536, 16384, 8192, 4096, 4096, 16384, 16384, 32768, 8192, 8192, 16384, 65536, 16384, 16384, 16384, 8192, 8192

77 : wrong
2097152, 1048576, 1048576, 2097152, 1048576, 262144, 262144, 524288, 1048576, 1048576, 1048576, 1048576, 2097152, 2097152, 1048576, 524288, 524288, 2097152, 524288, 524288, 524288, 524288, 2097152, 524288, 262144, 262144, 524288, 131072, 131072, 131072, 131072, 262144, 65536, 65536, 32768, 32768, 65536, 262144, 262144, 1048576, 1048576, 1048576, 262144, 262144, 524288, 524288, 131072, 65536, 65536, 32768, 32768, 65536, 32768, 32768, 65536, 2097152, 2097152, 131072, 65536, 65536, 131072, 131072, 262144, 65536, 65536, 131072, 1048576, 2097152, 2097152, 2097152, 4194304, 2097152, 524288, 524288, 1048576, 4194304, 8388608

8 : wrong
16384, 8192, 8192, 16384, 8192, 8192, 32768, 32768

11 : correct
8760958, 8760957, 547560, 547560, 547560, 273780, 273780, 2190239, 4380479, 4380479, 4380478

15 : correct
21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211, 21211

55 : wrong
0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0


output:
c/w
0
0
6
2
  15
  11
  4
1
0
  54

     */





    public static void main(String[] args){

        int[] C = {4, 1, 0, 1, 1, 0, 1};   // 3
        int[] B = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};  //54
        int[] A = {4096, 4096, 1024, 256, 256, 128, 128, 128, 128, 512,
                512, 512, 512, 256, 256, 512, 512,
                128, 32, 32, 32, 32, 128, 128, 1024, 1024,
                2048, 512, 512, 1024, 2048, 2048, 1024, 512,
                512, 2048, 2048, 2048, 16384, 16384, 2048,
                256, 128, 128, 512, 256, 256, 512, 2048, 1024,
                1024, 512, 512, 1024, 1024, 1024, 2048, 512,
                512, 1024, 4096, 4096, 4096, 2048, 2048, 4096,
                2048, 2048, 2048, 1024, 512, 256, 16, 16,
                32, 64, 128, 2048, 512, 512, 512, 512, 8192,
                8192, 32768, 32768, 65536, 16384, 8192, 4096,
                4096, 16384, 16384, 32768, 8192, 8192, 16384,
                65536, 16384, 16384, 16384, 8192, 8192};   //15

        int[] D = {2097152, 1048576, 1048576, 2097152, 1048576,
                262144, 262144, 524288, 1048576, 1048576, 1048576,
                1048576, 2097152, 2097152, 1048576, 524288, 524288,
                2097152, 524288, 524288, 524288, 524288, 2097152,
                524288, 262144, 262144, 524288, 131072, 131072, 131072,
                131072, 262144, 65536, 65536, 32768, 32768, 65536, 262144,
                262144, 1048576, 1048576, 1048576, 262144, 262144, 524288, 524288,
                131072, 65536, 65536, 32768, 32768, 65536, 32768, 32768, 65536,
                2097152, 2097152, 131072, 65536, 65536, 131072, 131072, 262144, 65536,
                65536, 131072, 1048576, 2097152, 2097152, 2097152, 4194304, 2097152,
                524288, 524288, 1048576, 4194304, 8388608
        }; //11

        int[] E = {16384, 8192, 8192, 16384, 8192, 8192, 32768, 32768};   //4

        int[] F = {0, 2, 0, 2, 0, 0, 0, 0, 2, 0, 0, 2, 2, 0, 2, 2, 2,
                2, 0, 0, 0, 2, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0,
                0, 2, 0, 2, 0, 2, 0, 2, 2
                }; //0

        int[] G = {999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994, 999999994, 999999994, 999999994,
                999999994, 999999994, 999999994
        }; // 6

        int[] H = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0,
                0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        }; //2


        HashMap<Character, Integer> answers = new HashMap<Character, Integer>();
        answers.put('A', 15);
        answers.put('B', 54);
        answers.put('C', 3);
        answers.put('D', 11);
        answers.put('E', 4);
        answers.put('F', 0);
        answers.put('G', 6);
        answers.put('H', 2);


        HashMap<Character, int[]> map = new HashMap<Character, int[]>();
        map.put('A', A);
        map.put('B', B);
        map.put('C', C);
        map.put('D', D);
        map.put('E', E);
        map.put('F', F);
        map.put('G', G);
        map.put('H', H);





        for(char i = 'A'; i < 'Z'; i++){
            if(map.containsKey(i)){
                int points = playGame(map.get(i));
                int answer = answers.get(i);

                if(points == answer){
                    System.out.println("CORRECT : " + points);
                } else {
                    System.out.println("WRONG : points " + points + " answer : " + answer);
                }
                System.out.println(" ---------------------------------------------------- ");

            }


        }



    }

    //public static Set<Integer> list = new HashSet<Integer>();


    public static int playGame(int[] A){
        //list.clear();
        return runNikitaGame(A);
    }


    // Correct Answer
    public static int runNikitaGame(int[] A){
        int points = 0;

        for (int i = 0; i < A.length; i++) {
            int[] leftHalf = Arrays.copyOfRange(A, 0, i + 1);
            int[] rightHalf = Arrays.copyOfRange(A, i + 1, A.length);
            int leftSum = getSum(0, leftHalf);
            int rightSum = getSum(0, rightHalf);
            if(leftHalf.length > 0 && rightHalf.length > 0){
                if(leftSum == rightSum){
                    //System.out.println("MATCH : " + leftSum + " : " + rightSum);
                    //list.add(leftSum);
                    points += Math.max(runNikitaGame(rightHalf), runNikitaGame(leftHalf)) + 1;
                    break;

                }
            }
        }

       // System.out.println(list.size());

       return points;
    }


    public static int runGame(int[] A, int points){
        int leftSum = 0;
        int rightSum = 0;
        boolean isEqual = false;

            for (int i = 0; i < A.length; i++) {
                leftSum += A[i];
                rightSum = getSum(i + 1, A);

                System.out.println("Sums : " + leftSum + " : " + rightSum);


                if (leftSum == rightSum) {
                    points++;
                    isEqual = true;


                    int[] leftHalf = Arrays.copyOfRange(A, 0, i + 1);
                    int[] rightHalf = Arrays.copyOfRange(A, i + 1, A.length);

                    if (leftHalf.length < 2) {
                        A = rightHalf;
                    } else if (rightHalf.length < 2) {
                        A = leftHalf;

                    } else {
                        if(leftHalf.length > rightHalf.length){
                            A = leftHalf;
                        } else {
                            A = rightHalf;
                        }
                    }
                    System.out.println("Points : " + points);
                    System.out.println("Left Half" + Arrays.toString(leftHalf));
                    System.out.println("Right Half" + Arrays.toString(rightHalf));
                    System.out.println("A : " + Arrays.toString(A));
                     break;
                }

            }
            if(isEqual){
                points = runGame(A, points);
            }


            /*

            if(A.length > 2 && isEqual){
                points = runGame(A, points);
            } else {
                if(A[0] == A[1]){
                    points++;
                }
            }
            */



            return points;

    }



    public static int getSum(int index, ArrayList<Integer> A){
        int sum = 0;
        for(int i = index; i < A.size(); i++){
            sum += A.get(i);
        }
        return sum;
    }


    public static int getSum(int index, int[] A){
        int sum = 0;
        for(int i = index; i < A.length; i++){
            sum += A[i];
        }
        return sum;
    }

    public static int getSum(int start, int end, int[] A){
        int sum = 0;
        for(int i = start; i < end; i++) {
            sum += A[i];
        }
        return sum;
    }









}
